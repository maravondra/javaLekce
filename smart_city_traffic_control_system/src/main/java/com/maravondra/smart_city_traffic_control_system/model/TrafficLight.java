package com.maravondra.smart_city_traffic_control_system.model;

import com.sun.jdi.Location;

import java.time.LocalDateTime;
import java.util.UUID;

public class TrafficLight {

    private  UUID id;
    private  String locationName;
    private GeoLocation coordinates;
    private LightState currentState;
    private LocalDateTime lastUpdate;

    public TrafficLight(UUID id, String locationName, GeoLocation coordinates, LightState currentState, LocalDateTime lastUpdate) {
        this.id = id;
        this.locationName = locationName;
        this.coordinates = coordinates;
        this.currentState = currentState;
        this.lastUpdate = lastUpdate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public GeoLocation getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(GeoLocation coordinates) {
        this.coordinates = coordinates;
    }

    public LightState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(LightState currentState) {
        this.currentState = currentState;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void changeState(LightState newState) {
        this.currentState = newState;
    }
}
