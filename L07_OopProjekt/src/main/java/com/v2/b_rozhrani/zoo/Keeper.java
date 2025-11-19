package com.v2.b_rozhrani.zoo;

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
public class Keeper extends Employee implements ShiftWorker {

  private final String animalType;
  private final double animalWeightKg;
  private boolean onShift = false;

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


  // Implementace metod z interface
  @Override
  public void startShift() {
    if (isLoggedIn()) {
      onShift = true;
      System.out.println(getName() + " začal směnu.");
    } else {
      System.out.println(getName() + " se musí přihlásit před začátkem směny.");
    }
  }

  @Override
  public void endShift() {
    onShift = false;
    System.out.println(getName() + " ukončil směnu.");
  }

  @Override
  public boolean isOnShift() {
    return onShift;
  }
}

