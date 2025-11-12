package com.v1.d_rozhrani.a_payment;

public interface PaymentMethod {

  boolean validate();                // ověří údaje

  double calculateFee(double amount); // vypočítá poplatek

  void processPayment(double amount); // provede platbu

}
