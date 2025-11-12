package com.v1.zalt.b_arraylist.ba_sortArraylist.a_soringInMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingInMain {

  public static void main(String[] args) {
    ArrayList<Person> list = new ArrayList<>();
    list.add(new Person("Alice", 30));
    list.add(new Person("Bob", 25));
    list.add(new Person("Charlie", 35));

    System.out.println("Před řazením: " + list);

    // Řazení podle věku (vzestupně)
    Collections.sort(list, new Comparator<Person>() {
      @Override
      public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);
      }
    });

    System.out.println("Po řazení podle věku: " + list);
  }
}
