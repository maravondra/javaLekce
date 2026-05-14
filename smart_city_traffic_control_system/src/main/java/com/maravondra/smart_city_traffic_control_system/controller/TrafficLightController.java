package com.maravondra.smart_city_traffic_control_system.controller;

import com.maravondra.smart_city_traffic_control_system.controller.dto.CreateTrafficLightRequest;
import com.maravondra.smart_city_traffic_control_system.controller.dto.TrafficLightResponse;
import com.maravondra.smart_city_traffic_control_system.model.LightState;
import com.maravondra.smart_city_traffic_control_system.service.TrafficLightService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/traffic-lights")
public class TrafficLightController {

    private final TrafficLightService trafficService;

    public TrafficLightController(TrafficLightService trafficService) {
        this.trafficService = trafficService;
    }

    /**
     * 1. GET s Query parametry
     * Ukázka: GET /api/v1/traffic-lights?status=RED
     */
    @GetMapping
    public List<TrafficLightResponse> getAllTrafficLights(
            @RequestParam(required = false) LightState status) {
        return trafficService.findAll(status);
    }

    /**
     * 2. GET s Path Variable a ošetřením existence
     * Ukázka: GET /api/v1/traffic-lights/550e8400-e29b-41d4-a716-446655440000
     */
    @GetMapping("/{id}")
    public ResponseEntity<TrafficLightResponse> getTrafficLight(@PathVariable UUID id) {
        // Service vrátí Optional nebo vyhodí výjimku, pokud ID neexistuje
        return trafficService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * 3. POST pro vytvoření nového zdroje
     * Ukázka: POST /api/v1/traffic-lights + JSON v Body
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TrafficLightResponse createTrafficLight(@RequestBody CreateTrafficLightRequest request) {
        return trafficService.create(request);
    }

    /**
     * 4. PATCH/PUT pro změnu stavu (Business akce)
     * Ukázka: PATCH /api/v1/traffic-lights/550e8400.../state?value=GREEN
     */
    @PatchMapping("/{id}/state")
    public TrafficLightResponse updateState(
            @PathVariable UUID id,
            @RequestParam LightState value) {
        return trafficService.updateState(id, value);
    }

    /**
     * 5. DELETE pro odstranění
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrafficLight(@PathVariable UUID id) {
        trafficService.delete(id);
    }
}
