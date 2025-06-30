package org.example.a_exception.pizza;

public class PrilisMocPizzException extends Exception {

  private final int pozadovanyPocet;
  private final int maximalniPocet;

  public PrilisMocPizzException(String message, int pozadovanyPocet, int maximalniPocet) {
    super(message);
    this.pozadovanyPocet = pozadovanyPocet;
    this.maximalniPocet = maximalniPocet;
  }

  public int getPozadovanyPocet() {
    return pozadovanyPocet;
  }

  public int getMaximalniPocet() {
    return maximalniPocet;
  }
}
