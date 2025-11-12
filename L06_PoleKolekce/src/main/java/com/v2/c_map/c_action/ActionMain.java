package com.v2.c_map.c_action;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ActionMain {

  /*
   * Představ si, že jsi organizátor velkých akcí – třeba konferencí a workshopů.
   * Sleduješ, kdo přišel na kterou akci.
   * HashMap ti pomůže rychle zjistit, kdo kam přišel (nebo spíš kde si dal nejvíc chlebíčků).
   */
  public static void main(String[] args) {
    // Vytvoření HashMap pro uchovávání účastníků a jejich akcí
    HashMap<String, String> participants = new HashMap<>();

    // Přidání účastníků
    participants.put("Alice", "Konference 2025");
    participants.put("Bob", "Workshop: Jak přežít pondělí");
    participants.put("Charlie", "Konference 2025");
    participants.put("Denisa", "Páteční chill-out party");

    // Výpis všech účastníků a jejich akcí
    System.out.println("📋 Přehled účastníků a jejich akcí:");
    for (Map.Entry<String, String> entry : participants.entrySet()) {
      System.out.println("👤 " + entry.getKey() + " se zúčastnil(a): " + entry.getValue());
    }

    // Možnost odhlásit účastníka z akce (uživatelský vstup)
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nZadej jméno účastníka, který se odhlásil z akce: ");
    String name = scanner.nextLine();

    if (participants.containsKey(name)) {
      participants.remove(name);
      System.out.println("❌ Účastník " + name + " byl úspěšně odhlášen.");
    } else {
      System.out.println("⚠️ Účastník s tímto jménem nebyl nalezen.");
    }

    // Výpis znovu po případném odhlášení
    System.out.println("\n📋 Aktuální seznam účastníků:");
    for (Map.Entry<String, String> entry : participants.entrySet()) {
      System.out.println("👤 " + entry.getKey() + " se zúčastnil(a): " + entry.getValue());
    }

    // Kontrola, zda někdo pořád paří
    if (participants.containsValue("Páteční chill-out party")) {
      System.out.println("\n🎉 Někteří účastníci se stále baví na 'Páteční chill-out party'!");
    } else {
      System.out.println("\n😢 Všichni účastníci se již odhlásili z 'Páteční chill-out party'.");
    }

    scanner.close();
  }
}
