package com.v1.f_souhrny;

public class Computer extends Asset {

    private final ComputerType type;

    public Computer(String description, Location location, ComputerType type) {
        super(description, location);
        this.type = type;
    }
}
