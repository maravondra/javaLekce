package com.v2.b_rozhrani.zoo;

public class MainZoo {

  public static void main(String[] args) {

    System.out.println("=== Správa zaměstnanců pražské ZOO ===");

    Keeper david = new Keeper("David", "keeper123", 2020, "slon", 5500);
    Cashier jana = new Cashier("Jana", "cash456", 2022, "Pokladna č.1");

    // Přihlášení a práce
    david.performDuty(); // ještě není přihlášen
    david.logIn("keeper123");
    david.performDuty();

    System.out.println();
    jana.logIn("wrongPass");
    jana.logIn("cash456");
    jana.performDuty();
    jana.openCashDesk();
    jana.performDuty();

    System.out.println();

    // Polymorfismus
    Employee e1 = david;
    Employee e2 = jana;
    e1.performDuty();
    e2.performDuty();

    // Interface reference
    ShiftWorker worker = jana;
    System.out.println(
        "Je " + worker.getClass().getSimpleName() + " na směně? " + worker.isOnShift());

    // Konec směny
    worker.endShift();
    // worker.performDuty(); // nepůjde, protože není na směně

    david.endShift();
    jana.logOut();

    System.out.println();

    // Přetypování
    if (e2 instanceof Cashier cashier) {
      cashier.closeCashDesk();
    }

    // Odhlášení
    e1.logOut();
    e2.logOut();

  }
}

