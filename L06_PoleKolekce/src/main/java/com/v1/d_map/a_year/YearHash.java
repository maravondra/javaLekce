package com.v1.d_map.a_year;

import java.util.HashMap;

public class YearHash {

    /*
        Příklad, kde HashMap slouží k uložení věku jednotlivých uživatelů podle jejich jména.
        Praktické využití: Tato struktura může sloužit k uchovávání informací o uživatelských profilech, kde klíčem je jméno a hodnotou věk.
     */

  public static void main(String[] args) {
    // Vytvoření HashMap pro ukládání věků uživatelů
    HashMap<String, Integer> userAges = new HashMap<>();

    // Přidání uživatelů a jejich věků
    userAges.put("Alice", 25);
    userAges.put("Bob", 30);
    userAges.put("Charlie", 22);

    // Získání věku uživatele podle jména
    System.out.println("Věk Alice: " + userAges.get("Alice")); // Výstup: Věk Alice: 25
    System.out.println("Věk Boba: " + userAges.get("Bob")); // Výstup: Věk Boba: 30
  }
}
