package com.v1.d_rozhrani.a_payment;

public class AplikaceMain {

  public static void main(String[] args) {
    PaymentProcessor processor = new PaymentProcessor();

    PaymentMethod card = new CreditCardPayment("1234567812345678", "Jan Novak", "12/26");
    PaymentMethod bank = new BankTransferPayment("CZ5508000000001234567899", "Eva Svobodová");

    processor.executePayment(card, 1000);
    processor.executePayment(bank, 5000);
  }
}
