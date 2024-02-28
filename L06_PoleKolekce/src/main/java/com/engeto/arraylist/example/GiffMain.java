package com.engeto.arraylist.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GiffMain {

  public static void main(String[] args) {

    // vyvorime si list
    List<Giff> listOfGiff = new ArrayList<>();

    Giff giffForWife = new Giff("Kytka", 100);
    Giff giffForMe = new Giff("Auto", 200);

    listOfGiff.add(giffForWife);
    listOfGiff.add(giffForMe);

    listOfGiff.forEach(System.out::println);

    // vyzkousime si jak velky je list
    System.out.println(listOfGiff.size());

    // a nyni vymazeme
    listOfGiff.clear();

    // a vypiseme znovu velikost
    System.out.println(listOfGiff.size());

    System.out.println("Po vymazani");
    listOfGiff.forEach(System.out::println);

    // bez vytvareni objektu
    listOfGiff.add(new Giff("Letadlo", 0));
    listOfGiff.add(new Giff("Kniha", 23));

    listOfGiff.forEach(System.out::println);
    listOfGiff.add(giffForWife);

    System.out.println(listOfGiff.contains(giffForWife));
    System.out.println(listOfGiff.contains(giffForMe));

    // vypocet celkove sumy naseho listu
    double sum = 0;
    for (Giff oneElemen : listOfGiff) {
      sum += oneElemen.getPrice();
    }
    System.out.println(sum);

    listOfGiff.forEach(System.out::println);
    // seradit , ale jak vi Java jak radit, muzeme si to definovat napriklad pomoci ceny vzestupne
    listOfGiff.sort(new Comparator<Giff>() {
      @Override
      public int compare(Giff o1, Giff o2) {
        if ((o1.getPrice() <= o2.getPrice())) {
          return 1;
        } else {
          return -1;
        }
      }
    });
    listOfGiff.forEach(System.out::println);

    Collections.sort(listOfGiff);
    listOfGiff.forEach(System.out::println);

  }

}
