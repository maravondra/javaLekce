package com.v1.c_LinkedList.a_BankQueue;

import java.util.LinkedList;

public class BankQueueExample {

  public static void main(String[] args) {
    LinkedList<String> queue = new LinkedList<>();

    // Běžní zákazníci
    queue.addLast("Zákazník 1");
    queue.addLast("Zákazník 2");
    queue.addLast("Zákazník 3");
    System.out.println("Fronta po příchodu zákazníků: " + queue);

    // Přišel VIP klient
    queue.addFirst("VIP Zákazník");
    System.out.println("Fronta po příchodu VIP klienta: " + queue);

    // Obsluha zákazníků
    System.out.println("\n--- Obsluha zákazníků ---");
    while (!queue.isEmpty()) {
      String current = queue.removeFirst();
      System.out.println("Obsluhuji: " + current);
      System.out.println("Zbývající fronta: " + queue);
    }
  }
}
