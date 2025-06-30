package org.example.b_vycet.a_todos;

import java.util.Scanner;

public class TaskApp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Zadejte název úkolu: ");
    String nazev = scanner.nextLine();

    System.out.print("Zadejte stav úkolu (NOVY, PROBIHA, HOTOVO, BLOKOVANO): ");
    String vstup = scanner.nextLine().toUpperCase();

    try {
      StavUkolu stav = StavUkolu.valueOf(vstup);
      Ukol ukol = new Ukol(nazev, stav);
      ukol.zobraz();
    } catch (IllegalArgumentException e) {
      System.out.println("⚠️ Neplatný stav úkolu. Zkuste to znovu.");
    }
  
  }
}
