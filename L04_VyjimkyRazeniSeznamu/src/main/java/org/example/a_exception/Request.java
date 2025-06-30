package org.example.a_exception;

public class Request {

  // ... další atributy
  int numberOfPassengers;

  // ... konstruktory a další metody

  public void setNumberOfPassengers(int passengers)
      throws InvalidRequestException {
    if (passengers < 1) {
      throw new InvalidRequestException(
          "Počet pasažérů nesmí být nižší než 1" +
              " (zadal jsi : " + passengers + ")");
    }

    // Další kód se provede jen pokud je vše v pořádku:
    numberOfPassengers = passengers;
  }

  public int getNumberOfPassengers() {
    return numberOfPassengers;
  }
}
