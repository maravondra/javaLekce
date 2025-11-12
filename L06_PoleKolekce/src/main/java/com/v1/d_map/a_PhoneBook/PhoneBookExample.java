package com.v1.d_map.a_PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookExample {

  public static void main(String[] args) {
    HashMap<String, String> phoneBook = new HashMap<>();

    // Přidání kontaktů
    phoneBook.put("Alice", "+420 123 456 789");
    phoneBook.put("Bob", "+420 987 654 321");
    phoneBook.put("Charlie", "+420 555 666 777");

    // Výpis všech kontaktů
    System.out.println("Telefonní seznam:");
    for (String name : phoneBook.keySet()) {
      System.out.println(name + ": " + phoneBook.get(name));
    }

    // Hledání kontaktu
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nZadej jméno pro vyhledání čísla: ");
    String searchName = scanner.nextLine();

    if (phoneBook.containsKey(searchName)) {
      System.out.println("Telefonní číslo: " + phoneBook.get(searchName));
    } else {
      System.out.println("Kontakt nenalezen.");
    }

    scanner.close();
  }
}
