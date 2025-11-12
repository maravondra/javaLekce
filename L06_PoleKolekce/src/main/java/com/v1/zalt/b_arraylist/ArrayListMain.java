package com.v1.zalt.b_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {

  public static void main(String[] args) {

    // deklarace list
    List<String> cars;

    // zalozeni ArrayList, kde jiz nemusi byt definova velikost
    cars = new ArrayList<>();

    // zkraceny zapis
    List<String> carsOneRow = new ArrayList<>();

    // pridat jeden prvek
    cars.add("Skoda auto");
    // zalozeni auta Daimler
    cars.add("Daimler");

    // vypsat jeden prvek
    System.out.println(cars.get(0));
    // vypsat druhy prvek
    System.out.println(cars.get(1));

    // neni mozne
    // System.out.println(cars.get(2));

    // ziska velikost ArrayList
    int sizeCars = cars.size();
    // vypsat list pomoci for cyklu
    for (int i = 0; i < sizeCars; i++) {
      System.out.println(cars.get(i));
    }

    // vypsat pomoc foreach, kde jiz nemusime dafinovat pozice
    for (String oneElement : cars) {
      System.out.println(oneElement);
    }

    // vypis pres array
    System.out.println(Arrays.toString(cars.toArray()));

    // jeste je mozne pridavat pomoci knihovny Collection
    Collections.addAll(cars, "Volwo", "Seat", "Opel", "Smart");

    // Novy list rovnou s hodnotami
    // nejdrive to vyzkousime bez methody toString()
    List<Integer> someNumbers = Arrays.asList(1, 5, 10, 25);
  }

}
