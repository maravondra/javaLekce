package com.v1.d_rozhrani.a_payment;

import java.time.LocalTime;

public class PaymentProcessor {

  private static final double TIME_TO_CLOSE = 20.0; // Čas do zavření v hodinách
  private static final double MAX_AMOUNT = 10000.0; // Maximální částka pro platbu

  public void executePayment(
      PaymentMethod method,
      double amount) {
    System.out.println("Zpracovávám platbu: " + amount + " Kč ");

    LocalTime currentTime = LocalTime.now();
    if (currentTime.getHour() < TIME_TO_CLOSE) {
      if (amount > MAX_AMOUNT) {
        System.err.println("Platba přesahuje maximální limit " + MAX_AMOUNT + " Kč.");
        return;
      }
      method.processPayment(amount);
    }
  }
}
