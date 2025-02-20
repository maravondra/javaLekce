package com.engeto.ba_sortArraylist.b_sortingInClass;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInClass {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 30));
        list.add(new Person("Bob", 25));
        list.add(new Person("Charlie", 35));

        System.out.println("Před řazením: " + list);

        // Řazení pomocí přirozeného pořadí (na základě metody compareTo)
        Collections.sort(list);

        System.out.println("Po řazení podle věku: " + list);
    }
}
