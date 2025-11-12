package com.v1.f_souhrny;

public class Asset {

    private static int nextId = 1;

    private final int id = nextId++;
    private String description;

    private Location location;

    public Asset(String description, Location location) {
        this.description = description;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
