package com.v1.c_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();

    // Přidání prvků
    set.add("Java");
    set.add("Python");
    set.add("C++");

    // Pokus o přidání duplikátu (vrátí false)
    boolean added = set.add("Java");
    System.out.println("Přidání duplikátu 'Java': " + added);

    // Zobrazení velikosti Setu
    System.out.println("Velikost Setu: " + set.size());

    // Kontrola existence prvku
    if (set.contains("Python")) {
      System.out.println("'Python' je v Setu.");
    }

    // Odebrání prvku
    set.remove("C++");

    // Výpis všech prvků
    System.out.println("Prvky v Setu: " + set);

    // Vyprázdnění Setu
    set.clear();
    System.out.println("Po vyprázdnění: " + set);

    // Rozdil mezi HashSet a TreeSet
    Set<String> namesHash = new HashSet<>();
    namesHash.add("Tom");
    namesHash.add("Anna");
    namesHash.add("Anna"); // nebude přidáno
    namesHash.add("Zuzka");
    System.out.println(namesHash); // [Tom, Anna, Zuzka]

    Set<String> namesTree = new TreeSet<>();
    namesTree.add("Tom");
    namesTree.add("Anna");
    namesTree.add("Anna"); // nebude přidáno
    namesTree.add("Zuzka");
    System.out.println(namesTree); // [Anna, Tom]


  }
}
