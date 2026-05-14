package com.maravondra.smart_city_traffic_control_system.controller.dto;

public record TrafficLightResponse(
        String id,
        String locationName,
        String status,
        String lastUpdateFormatted
) {}
