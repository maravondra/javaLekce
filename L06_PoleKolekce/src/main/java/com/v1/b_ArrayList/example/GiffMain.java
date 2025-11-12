package com.v1.b_ArrayList.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GiffMain {

  public static void main(String[] args) {

    // vyvorime si list
    List<Giff> listOfGift = new ArrayList<>();

    Giff giffForWife = new Giff("Kytka", 100);
    Giff giffForMe = new Giff("Auto", 200);

    listOfGift.add(giffForWife);
    listOfGift.add(giffForMe);

    listOfGift.forEach(System.out::println);

    // vyzkousime si jak velky je list
    System.out.println(listOfGift.size());

    // a nyni vymazeme
    listOfGift.clear();

    // a vypiseme znovu velikost
    System.out.println(listOfGift.size());

    System.out.println("Po vymazani");
    listOfGift.forEach(System.out::println);

    // bez vytvareni objektu
    listOfGift.add(new Giff("Letadlo", 0));
    listOfGift.add(new Giff("Kniha", 23));

    listOfGift.forEach(System.out::println);
    listOfGift.add(giffForWife);

    System.out.println(listOfGift.contains(giffForWife));
    System.out.println(listOfGift.contains(giffForMe));

    // vypocet celkove sumy naseho listu
    double sum = 0;
    for (Giff oneElemen : listOfGift) {
      sum += oneElemen.getPrice();
    }
    System.out.println(sum);

    listOfGift.forEach(System.out::println);
    // seradit , ale jak vi Java jak radit, muzeme si to definovat napriklad pomoci ceny vzestupne
    listOfGift.sort(new Comparator<Giff>() {
      @Override
      public int compare(Giff o1, Giff o2) {
        if ((o1.getPrice() <= o2.getPrice())) {
          return 1;
        } else {
          return -1;
        }
      }
    });
    listOfGift.forEach(System.out::println);

    Collections.sort(listOfGift);
    listOfGift.forEach(System.out::println);

  }

}
