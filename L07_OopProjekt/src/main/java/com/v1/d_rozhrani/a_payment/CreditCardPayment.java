package com.v1.d_rozhrani.a_payment;

public class CreditCardPayment implements PaymentMethod {

  private final String cardNumber;
  private final String cardHolder;
  private final String expiration;

  public CreditCardPayment(String cardNumber, String cardHolder, String expiration) {
    this.cardNumber = cardNumber;
    this.cardHolder = cardHolder;
    this.expiration = expiration;
  }

  @Override
  public boolean validate() {
    return cardNumber != null && cardNumber.length() == 16;
  }

  @Override
  public double calculateFee(double amount) {
    return amount * 0.02; // 2% poplatek
  }

  @Override
  public void processPayment(double amount) {
    if (!validate()) {
      System.out.println("Neplatná karta.");
      return;
    }
    double fee = calculateFee(amount);
    System.out.println(
        "Platba kartou proběhla: částka " + amount + " Kč, poplatek: " + fee + " Kč");
  }
}
