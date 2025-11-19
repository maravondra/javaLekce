package com.v2.c_record;

public record Animal(String species, String name, double weightKg, int age) {

  // Metoda pro převod hmotnosti
  public double weightInPounds() {
    return weightKg * 2.20462;
  }

  // Kompaktní konstruktor s validací
  public Animal {
    if (weightKg <= 0) {
      throw new IllegalArgumentException("Weight must be positive");
    }
    if (age < 0) {
      throw new IllegalArgumentException("Age must be non-negative");
    }
  }
}
