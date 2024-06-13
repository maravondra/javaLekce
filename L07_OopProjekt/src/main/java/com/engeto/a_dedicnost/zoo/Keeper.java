package com.engeto.a_dedicnost.zoo;

public class Keeper extends User {

  private String nameOfMyAnimal;
  private int weightOfMyAnimal; // v kg

  // WARNING: Tuto konstantu si vytvorime az pozdeji
  private final double RATE_KG_TO_POUND = 2.204;

  public Keeper(String name, String password, int yearOfBoarding, String nameOfMyAnimal,
      int weightOfMyAnimal) {
    super(name, password, yearOfBoarding);
    this.nameOfMyAnimal = nameOfMyAnimal;
    this.weightOfMyAnimal = weightOfMyAnimal;
  }

  // WARNING: Tuto metodu si vytvorime az pozdeji
  public double weightInPound() {
    return weightOfMyAnimal * RATE_KG_TO_POUND;
  }

  public String getNameOfMyAnimal() {
    return nameOfMyAnimal;
  }

  public void setNameOfMyAnimal(String nameOfMyAnimal) {
    this.nameOfMyAnimal = nameOfMyAnimal;
  }

  public int getWeightOfMyAnimal() {
    return weightOfMyAnimal;
  }

  public void setWeightOfMyAnimal(int weightOfMyAnimal) {
    this.weightOfMyAnimal = weightOfMyAnimal;
  }
}
