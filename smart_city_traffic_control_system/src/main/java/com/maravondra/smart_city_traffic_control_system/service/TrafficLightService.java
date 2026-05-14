package com.maravondra.smart_city_traffic_control_system.service;

import com.maravondra.smart_city_traffic_control_system.controller.dto.CreateTrafficLightRequest;
import com.maravondra.smart_city_traffic_control_system.controller.dto.TrafficLightResponse;
import com.maravondra.smart_city_traffic_control_system.model.GeoLocation;
import com.maravondra.smart_city_traffic_control_system.model.LightState;
import com.maravondra.smart_city_traffic_control_system.model.TrafficLight;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

import javax.xml.stream.Location;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class TrafficLightService {

    // Cesta k souboru, kde budou data uložena
    private static final String FILE_PATH = "traffic_lights.json";
    private final ObjectMapper objectMapper; // Nástroj pro převod objektu na JSON
    private final SystemConfigService configService;

    public TrafficLightService(ObjectMapper objectMapper,SystemConfigService configService) {
        this.objectMapper = objectMapper;
        this.configService = configService;
        initFile();
    }

    /**
     * Zajistí, že soubor existuje při startu aplikace
     */
    private void initFile() {
        try {
            Path path = Paths.get(FILE_PATH);
            if (!Files.exists(path)) {
                Files.writeString(path, "[]"); // Inicializace prázdným polem
            }
        } catch (IOException e) {
            throw new RuntimeException("Nepodařilo se inicializovat soubor s daty", e);
        }
    }

    // --- CRUD OPERACE ---
    public List<TrafficLightResponse> findAll(LightState filter) {
        List<TrafficLight> lights = loadAllFromFile();
        return lights.stream()
                .filter(l -> filter == null || l.getCurrentState() == filter)
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    public Optional<TrafficLightResponse> findById(UUID id) {
        return loadAllFromFile().stream()
                .filter(l -> l.getId().equals(id))
                .map(this::mapToResponse)
                .findFirst();
    }

    public TrafficLightResponse create(CreateTrafficLightRequest request) {
        List<TrafficLight> lights = loadAllFromFile();

        // Vytvoření nové entity
        TrafficLight newLight = new TrafficLight(
                UUID.randomUUID(), // Generování ID, pokud není poskytnuto
                request.locationName(),
                new GeoLocation(request.lat(), request.lon()),
                LightState.RED, // Výchozí stav
                LocalDateTime.now()
        );

        lights.add(newLight);
        saveAllToFile(lights);
        return mapToResponse(newLight);
    }

    public TrafficLightResponse updateState(UUID id, LightState newState) {
        List<TrafficLight> lights = loadAllFromFile();

        if (configService.isLocked()) {
            System.out.println("SYSTÉM UZAMČEN - nelze měnit stav semaforu!");
            throw new IllegalStateException("SYSTÉM UZAMČEN (Konfigurace v souboru)");
        }

        //zde nelze pustit Emergency_green
        if(newState == LightState.EMERGENCY_GREEN) {
            throw new RuntimeException("Nelze nastavit stav na EMERGENCY_GREEN pomocí této metody!");
        }



        TrafficLight light = lights.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Semafor nenalezen!"));

        //zaroven take nelze menit, pokud je Emergency_GREEN
        if(light.getCurrentState() == LightState.EMERGENCY_GREEN) {
            throw new RuntimeException("Nelze měnit stav semaforu, který je v EMERGENCY_GREEN!");
        }

        light.changeState(newState); // Business logika v modelu
        saveAllToFile(lights);
        return mapToResponse(light);
    }

    // --- POMOCNÉ METODY PRO PRÁCI SE SOUBOREM ---
    public List<TrafficLight> loadAllFromFile() {
        // Přečte soubor a převede JSON pole na List objektů
        TrafficLight[] array = objectMapper.readValue(new File(FILE_PATH), TrafficLight[].class);
        return new ArrayList<>(Arrays.asList(array));
    }

    public void saveAllToFile(List<TrafficLight> lights) {
        // Zapíše List do souboru jako zformátovaný JSON
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE_PATH), lights);
    }

    private TrafficLightResponse mapToResponse(TrafficLight light) {
        return new TrafficLightResponse(
                light.getId().toString(),
                light.getLocationName(),
                light.getCurrentState().name(),
                light.getLastUpdate().toString()
        );
    }

    public void delete(UUID trafficLightId) {
    }
}
