package org.example.a_exception;

public class TaxiMain {


  public static void main(String[] args) {
    Request request = new Request();
    try {
      request.setNumberOfPassengers(3);
      request.setNumberOfPassengers(-1);
      request.setNumberOfPassengers(8);
    } catch (InvalidRequestException ex) {
      System.err.println("Chyba nastavení počtu pasažérů: " +
          ex.getMessage());
    }
    System.out.println("Počet pasažérů: " +
        request.getNumberOfPassengers());

  }
}
