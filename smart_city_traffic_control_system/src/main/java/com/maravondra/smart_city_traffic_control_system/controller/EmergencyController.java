package com.maravondra.smart_city_traffic_control_system.controller;

import com.maravondra.smart_city_traffic_control_system.service.EmergencyService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/emergency/")
public class EmergencyController {

    private final EmergencyService emergencyService;

    public EmergencyController(EmergencyService emergencyService) {
        this.emergencyService = emergencyService;
    }

    /**
     * Endpoint volaný vozidlem IZS (Integrovaný záchranný systém)
     * POST /api/v1/emergency/ambulance-pass?intersectionId=...
     */
    @PostMapping("/ambulance-pass")
    @ResponseStatus(HttpStatus.ACCEPTED) // 202 Accepted - požadavek přijat ke zpracování
    public void reportAmbulancePass(@RequestParam UUID intersectionId) {
        emergencyService.handleAmbulancePriority((intersectionId));
    }

    /**
     * NOVINKA: Spuštění zelené vlny pro celou trasu
     * POST /api/v1/emergency/green-wave?startIntersectionId=...
     */
    @GetMapping("/green-wave")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void triggerGreenWave(@RequestParam String routeName) {
        emergencyService.executeRouteWave(routeName);
    }

    @PostMapping("/reset")
    @ResponseStatus(HttpStatus.OK)
    public void resetSystem() {
        emergencyService.resetAllToRed();
    }
}
