package com.v1.f_souhrny;

import java.time.LocalDate;

public class Vehicle extends Asset {

    private int mileage;
    private LocalDate roadWorthinessTestDate;

    public Vehicle(String description, Location location) {
        super(description, location);
        mileage = 0;
        roadWorthinessTestDate =
                LocalDate.now().plusYears(2);
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public LocalDate getRoadWorthinessTestDate() {
        return roadWorthinessTestDate;
    }

    public void setRoadWorthinessTestDate(LocalDate roadWorthinessTestDate) {
        this.roadWorthinessTestDate = roadWorthinessTestDate;
    }
}