package com.engeto.d_set.b_CompareCities;

import java.util.HashSet;

public class CommonCities {

    public static void main(String[] args) {
        HashSet<String> europeanCities = new HashSet<>();
        europeanCities.add("Berlin");
        europeanCities.add("Paris");
        europeanCities.add("Rome");
        europeanCities.add("Madrid");
        europeanCities.add("Stockholm");

        HashSet<String> czechCities = new HashSet<>();
        czechCities.add("Praha");
        czechCities.add("Brno");
        czechCities.add("Ostrava");
        czechCities.add("Plzeň");

        // Průnik setů (společná města)
        europeanCities.retainAll(czechCities);
        System.out.println("Společná města: " + europeanCities);
    }
}
