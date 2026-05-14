package com.maravondra.smart_city_traffic_control_system.service;

import com.maravondra.smart_city_traffic_control_system.controller.dto.TrafficLightResponse;
import com.maravondra.smart_city_traffic_control_system.model.LightState;
import com.maravondra.smart_city_traffic_control_system.model.TrafficLight;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class EmergencyService {

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(4);
    private final TrafficLightService trafficLightService;

    public EmergencyService(TrafficLightService trafficLightService) {
        this.trafficLightService = trafficLightService;
    }

    public void handleAmbulancePriority(UUID id) {
        // 1. Načteme všechna data ze souboru
        List<TrafficLight> lights = trafficLightService.loadAllFromFile();

        // 2. Najdeme konkrétní křižovatku
        TrafficLight targetLight = lights.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Křižovatka s ID " + id + " neexistuje!"));

        // 3. Aktivujeme Emergency Green
        System.out.println("!!! AMBULANCE DETECTED - Setting Emergency Green for: " + id);
        targetLight.changeState(LightState.EMERGENCY_GREEN);
        trafficLightService.saveAllToFile(lights);

        // 4. Naplánujeme návrat do normálu za 10 sekund (Asynchronně)
        CompletableFuture.delayedExecutor(10, TimeUnit.SECONDS).execute(() -> {
            // Pozor: Musíme znovu načíst a uložit, aby se změna projevila v souboru
            List<TrafficLight> currentLights = trafficLightService.loadAllFromFile();
            currentLights.stream()
                    .filter(l -> l.getId().equals(id))
                    .findFirst()
                    .ifPresent(l -> {
                        l.changeState(LightState.RED);
                        trafficLightService.saveAllToFile(currentLights);
                        System.out.println(">>> Priority ended. Intersection " + id + " back to RED.");
                    });
        });
    }

    private final Map<String, List<String>> predefinedRoutes = Map.of(
            "MAIN_AVENUE", List.of(
                    "732f6cc4-efc7-4b5c-9c8c-8a45e25ad2e0", // Prasna brana - Na Prikope
                    "58f7133a-cca2-4cb8-a365-300dcf474814", // I.P. Pavlova - Magistrala
                    "ed5e8703-2ab9-4484-95c1-d4d200dae164"  // Letenske namesti
            ),
            "HISTORIC_CENTER", List.of(
                    "e67144c4-d8d1-41c3-bf32-ea7228c16e7f", // Narodni muzeum - Vinohradska
                    "db7932af-0987-4055-98c0-3ddf26db2c97"  // Malostranske namesti
            )
    );

    public void executeRouteWave(String routeName) {
        List<String> routeIds = predefinedRoutes.get(routeName);

        if (routeIds == null) {
            throw new RuntimeException("Route " + routeName + " not found!");
        }

        int delay = 0;
        for (String idValue : routeIds) {

            // Každá další křižovatka v seznamu se zapne o 5 sekund později než ta předchozí
            final int finalDelay = delay;
            scheduler.schedule(() -> {
                System.out.println("🌊 Route Wave [" + routeName + "]: Activating " + idValue);
                handleAmbulancePriority(UUID.fromString(idValue)); // Necháme ji zelenou 12s
            }, finalDelay, TimeUnit.SECONDS);

            delay += 5; // Inkrementujeme zpoždění pro příští prvek v listu
        }
    }

    /**
     * Resetuje všechny křižovatky v systému na stav RED.
     * Užitečné pro ukončení všech prioritních režimů najednou.
     */
    public void resetAllToRed() {
        System.out.println("🛑 SYSTEM RESET: Setting all intersections to RED");

        // 1. Načteme aktuální stav všech křižovatek
        List<TrafficLight> lights = trafficLightService.loadAllFromFile();

        // 2. Všem nastavíme RED
        lights.forEach(light -> light.changeState(LightState.RED));

        // 3. Uložíme hromadně zpět do souboru
        trafficLightService.saveAllToFile(lights);
    }
}
