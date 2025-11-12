package com.v1.c_set.a_city;

import java.util.HashSet;

public class CityMain {

  public static void main(String[] args) {
    HashSet<String> cities = new HashSet<>();

    // Přidání měst
    cities.add("Praha");
    cities.add("Brno");
    cities.add("Ostrava");
    cities.add("Plzeň");
    cities.add("Olomouc");

    // Kontrola existence města
    System.out.println("Je Praha v setu? " + cities.contains("Praha"));

    // Pokus o přidání duplikátu
    boolean added = cities.add("Praha");
    System.out.println("Přidání Prahy znovu: " + added);

    // Výpis všech měst
    System.out.println("Města v setu: " + cities);

    // prace s Hashem
    System.out.println("Prvky v HashSetu:");
    for (String item : cities) {
      System.out.println(item + " (hash: " + item.hashCode() + ")");
    }

    String hashCityForBrno = "Brno";
    System.out.println(hashCityForBrno + " (hash: " + hashCityForBrno.hashCode() + ")");
  }
}
