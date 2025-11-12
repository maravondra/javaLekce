package com.v1.c_LinkedList.c_OrderManagement;

import java.util.LinkedList;

public class LinkedListMain {

  /***
   Jasně! Tady je praktický příklad, kde použijeme LinkedList k implementaci systému
   správy objednávek v e-shopu.
   Tento příklad ukáže, jak používat LinkedList pro přidávání,
   odebírání, hledání a úpravu objednávek.
   */


  public static void main(String[] args) {
    // Vytvoření LinkedList pro správu objednávek
    LinkedList<Order> orders = new LinkedList<>();

    // Přidání objednávek
    orders.add(new Order("ORD001", "John Doe", 150.75));
    orders.add(new Order("ORD002", "Jane Smith", 89.99));
    orders.add(new Order("ORD003", "Alice Johnson", 200.50));
    System.out.println("Seznam objednávek: " + orders);

    // Přidání nové objednávky na začátek seznamu
    orders.addFirst(new Order("ORD004", "Bob Brown", 120.45));
    System.out.println("Po přidání na začátek: " + orders);

    // Odebrání první objednávky (např. zrušení objednávky)
    orders.removeFirst();
    System.out.println("Po odstranění první objednávky: " + orders);

    // Aktualizace ceny objednávky
    Order orderToUpdate = orders.get(1);  // Vybereme objednávku na indexu 1
    orderToUpdate.totalPrice = 250.00;  // Změníme cenu objednávky
    System.out.println("Po úpravě ceny objednávky: " + orders);

    // Hledání objednávky podle ID
    String orderIdToFind = "ORD002";
    boolean found = false;
    for (Order order : orders) {
      if (order.orderId.equals(orderIdToFind)) {
        System.out.println("Objednávka nalezena: " + order);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Objednávka s ID " + orderIdToFind + " nebyla nalezena.");
    }

    // Odebrání konkrétní objednávky
    orders.removeIf(order -> order.orderId.equals("ORD003"));
    System.out.println("Po odstranění objednávky s ID ORD003: " + orders);
  }
}
