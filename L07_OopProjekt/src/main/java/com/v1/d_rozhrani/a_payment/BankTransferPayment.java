package com.v1.d_rozhrani.a_payment;

public class BankTransferPayment implements PaymentMethod {

  private final String iban;
  private final String accountHolder;

  public BankTransferPayment(String iban, String accountHolder) {
    this.iban = iban;
    this.accountHolder = accountHolder;
  }

  @Override
  public boolean validate() {
    return iban != null && iban.startsWith("CZ");
  }

  @Override
  public double calculateFee(double amount) {
    return 10.0; // fixní poplatek
  }

  @Override
  public void processPayment(double amount) {
    if (!validate()) {
      System.out.println("Neplatný IBAN.");
      return;
    }
    double fee = calculateFee(amount);
    System.out.println(
        "Platba převodem proběhla: částka " + amount + " Kč, poplatek: " + fee + " Kč");
  }
}
