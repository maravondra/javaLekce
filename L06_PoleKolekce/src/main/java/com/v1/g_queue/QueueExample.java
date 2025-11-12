package com.v1.g_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

  public static void main(String[] args) {
    // Fronta zákazníků
    Queue<String> customerQueue = new LinkedList<>();

    // Zákazníci přicházejí do fronty
    customerQueue.add("Alice");
    customerQueue.add("Bob");
    customerQueue.add("Charlie");

    System.out.println("🛒 Zákazníci ve frontě: " + customerQueue);

    // Obsluha zákazníků ve frontě (FIFO)
    while (!customerQueue.isEmpty()) {
      String servedCustomer = customerQueue.poll();  // odebere prvního ve frontě
      System.out.println("👩‍💼 Obsloužen zákazník: " + servedCustomer);
    }

    System.out.println("✅ Fronta je prázdná.");
  }
}
