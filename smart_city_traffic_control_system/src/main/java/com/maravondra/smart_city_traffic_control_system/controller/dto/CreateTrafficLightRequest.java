package com.maravondra.smart_city_traffic_control_system.controller.dto;

public record CreateTrafficLightRequest(
        String id,
        String locationName,
        double lat,
        double lon
) {}
