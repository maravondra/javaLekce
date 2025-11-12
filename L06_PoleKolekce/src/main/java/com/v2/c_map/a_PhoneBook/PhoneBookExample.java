package com.v2.c_map.a_PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookExample {

  public static void main(String[] args) {
    HashMap<String, People> phoneBook = new HashMap<>();

    phoneBook.put("Novakova", new People("Alice", 35, "1111"));
    phoneBook.put("Prochazka", new People("Bob", 25, "2222"));

    // Výpis všech kontaktů
    // Vypis vsech kontaktu
    System.out.println();
    System.out.println("*** Telefonni seznam *** ");
    for (String name : phoneBook.keySet()) {
      //System.out.println(name);
      People p = phoneBook.get(name);
      //System.out.println(p);
      System.out.printf("%s - prijmeni %s a vek %d %s%n", name, p.getName(), p.getAge(),
          p.getPhoneNumber());

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
