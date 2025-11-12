package com.v1.c_set.c_RemoveHash;

import java.util.HashSet;

public class RemoveHash {

  public static void main(String[] args) {
    HashSet<String> books = new HashSet<>();

    // Přidání knih
    books.add("Moby Dick");
    books.add("1984");
    books.add("War and Peace");
    books.add("To Kill a Mockingbird");
    books.add("The Great Gatsby");

    // Odebrání knihy
    books.remove("1984");

    // Kontrola existence knihy
    System.out.println("Je kniha '1984' v setu? " + books.contains("1984"));

    // Výpis všech knih
    System.out.println("Seznam knih v setu: " + books);
  }
}
