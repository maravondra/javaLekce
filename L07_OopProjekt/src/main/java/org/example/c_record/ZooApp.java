package org.example.c_record;


import java.util.List;

public class ZooApp {

  public static void main(String[] args) {

    List<Animal> animals = List.of(
        new Animal("Elephant", "Dumbo", 5400, 25),
        new Animal("Tiger", "Shere Khan", 220, 10),
        new Animal("Giraffe", "Melman", 800, 12)
    );

    for (Animal a : animals) {
      System.out.printf("%s (%s): %.1f kg (%.1f lb), %d years old%n",
          a.name(), a.species(), a.weightKg(), a.weightInPounds(), a.age());
    }

    System.out.println();
    System.out.println("Počet zvířat: " + animals.size());
  }
}

