package com.engeto.f_souhrny;

public class Room implements Location {

    private String buildingDescription;
    private int roomNumber;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        buildingDescription = "";
    }

    public Room(int roomNumber, String buildingDescription) {
        this.roomNumber = roomNumber;
        this.buildingDescription = buildingDescription;
    }

    @Override
    public String getDescription() {
        String building;
        if (buildingDescription.isEmpty()) {
            building = "";
        } else {
            building = " (" + buildingDescription + ")";
        }
        return roomNumber + building;
    }

    public String getBuildingDescription() {
        return buildingDescription;
    }

    public void setBuildingDescription(String buildingDescription) {
        this.buildingDescription = buildingDescription;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}