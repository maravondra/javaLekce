package com.v1.c_set.b_FindSameCities;

import java.util.HashSet;

public class FindCities {

  public static void main(String[] args) {
    HashSet<String> europeanCities = new HashSet<>();
    europeanCities.add("Berlin");
    europeanCities.add("Paris");
    europeanCities.add("Rome");
    europeanCities.add("Madrid");
    europeanCities.add("Stockholm");
    europeanCities.add("Prague"); // Praha

    HashSet<String> czechCities = new HashSet<>();
    czechCities.add("Praha");
    czechCities.add("Brno");
    czechCities.add("Ostrava");
    czechCities.add("Plzeň");
    // Přidání některých evropských měst, která jsou i v ČR
    czechCities.add("Prague"); // Praha

    // Průnik setů (společná města)
    europeanCities.retainAll(czechCities);
    System.out.println("Společná města: " + europeanCities);
  }
}
