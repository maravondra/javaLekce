package com.v1.d_map.d_orders;

import java.util.HashMap;

public class OrdersMain {


  /*
  V tomto příkladu sledujeme počet objednávek na základě ID objednávky pomocí HashMap. Tento příklad ukazuje využití v situacích, kdy sledujeme a počítáme výskyty určitých událostí.

  Praktické využití: Tento příklad je vhodný pro systémy, které sledují počet objednávek pro různé produkty nebo služby a potřebují udržovat statistiky.
   */
  public static void main(String[] args) {
    // Vytvoření HashMap pro uchovávání počtu objednávek podle ID
    HashMap<String, Integer> orderCounts = new HashMap<>();

    // Představme si, že přijímáme ID objednávek a zvyšujeme jejich počty
    orderCounts.put("order123", 1);
    orderCounts.put("order124", 2);
    orderCounts.put("order123", orderCounts.get("order123") + 1); // Zvyšujeme počet pro order123

    // Zobrazení počtu objednávek
    System.out.println("Počet objednávek s ID order123: " + orderCounts.get(
        "order123")); // Výstup: Počet objednávek s ID order123: 2
    System.out.println("Počet objednávek s ID order124: " + orderCounts.get(
        "order124")); // Výstup: Počet objednávek s ID order124: 2

  }
}
