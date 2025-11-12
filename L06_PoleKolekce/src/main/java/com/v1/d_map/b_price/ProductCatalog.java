package com.v1.d_map.b_price;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductCatalog {

    /*
    Představ si e-commerce aplikaci, kde HashMap uchovává produkty a jejich ceny. Pomocí containsKey() můžeme zkontrolovat, jestli je produkt v nabídce, a containsValue() pro kontrolu, zda existuje produkt za určitou cenu.

    Praktické využití: Tento příklad je vhodný pro e-shop, kde kontrolujeme, jestli máme produkt skladem nebo jestli existuje nějaký produkt za určitou cenu.
     */

  public static void main(String[] args) {
    // Vytvoření HashMap pro produkty a jejich ceny
    HashMap<String, Double> products = new HashMap<>();
    products.put("Laptop", 799.99);
    products.put("Smartphone", 499.99);
    products.put("Tablet", 299.99);

    // Výpis všech produktů a jejich cen
    System.out.println("Dostupné produkty:");
    for (Map.Entry<String, Double> entry : products.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue() + " EUR");
    }

    // Vyhledávání produktu podle názvu
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nZadej název produktu pro zjištění ceny: ");
    String searchProduct = scanner.nextLine();

    if (products.containsKey(searchProduct)) {
      System.out.println(
          "Cena produktu " + searchProduct + " je " + products.get(searchProduct) + " EUR.");
    } else {
      System.out.println("Produkt nebyl nalezen.");
    }

    // Kontrola existence produktu s určitou cenou
    System.out.print("\nZadej cenu produktu pro nalezeni: ");
    double searchPrice = scanner.nextDouble();

    System.out.println("Produkty levnější než " + searchPrice + " EUR:");
    boolean found = false;
    for (Map.Entry<String, Double> entry : products.entrySet()) {
      if (entry.getValue() < searchPrice) {
        System.out.println(entry.getKey() + " - " + entry.getValue() + " EUR");
        found = true;
      }
    }
    if (!found) {
      System.out.println("Žádné produkty nejsou levnější než zadaná cena.");
    }

    scanner.close();
  }
}
