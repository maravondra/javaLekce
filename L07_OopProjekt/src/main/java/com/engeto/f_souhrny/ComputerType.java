package com.engeto.f_souhrny;

public enum ComputerType {

    LAPTOP("laptop"),
    DESKTOP("desktop"),
    TABLET("tablet");

    private final String description;

    ComputerType(String description) {
        this.description = description;
    }
}
