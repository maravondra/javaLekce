package com.v2.a_dedicnost;

/**
 * 🦣 2. Třída Keeper (Chovatel)
 * <p>
 * - Dědičnost (extends Employee)
 * <p>
 * - Přepsání abstraktní metody performDuty()
 * <p>
 * - Vlastní metody a atributy, které Employee nemá
 * <p>
 * - Override logOut() pro personalizované chování
 */
public class Keeper extends Employee {

  private final String animalType;
  private final double animalWeightKg;

  public Keeper(String name, String password, int yearOfHire, String animalType,
      double animalWeightKg) {
    super(name, password, yearOfHire);
    this.animalType = animalType;
    this.animalWeightKg = animalWeightKg;
  }

  @Override
  public void performDuty() {
    if (isLoggedIn()) {
      System.out.println(getName() + " krmí " + animalType + "a a kontroluje jeho zdravotní stav.");
    } else {
      System.out.println(getName() + " se nejprve musí přihlásit, než začne pracovat.");
    }
  }

  public double getAnimalWeightKg() {
    return animalWeightKg;
  }

  public double getAnimalWeightLb() {
    return animalWeightKg * 2.20462;
  }

  @Override
  public void logOut() {
    System.out.println(getName() + " (chovatel) dokončil směnu a odhlásil se.");
    super.logOut();
  }
}

