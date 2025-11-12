package org.example.b_rozhrani.zoo;

/**
 * 💰 3. Třída Cashier (Pokladní)
 */

public class Cashier extends Employee implements ShiftWorker {

  private final String cashDeskName;
  private boolean cashDeskOpen = false;
  private boolean onShift = false;


  public Cashier(String name, String password, int yearOfHire, String cashDeskName) {
    super(name, password, yearOfHire);
    this.cashDeskName = cashDeskName;
  }

  public void openCashDesk() {
    if (isLoggedIn()) {
      cashDeskOpen = true;
      System.out.println(getName() + " otevřel/a " + cashDeskName + ".");
    } else {
      System.out.println(getName() + " se musí přihlásit, než otevře pokladnu!");
    }
  }

  public void closeCashDesk() {
    if (cashDeskOpen) {
      cashDeskOpen = false;
      System.out.println(getName() + " uzavřel/a " + cashDeskName + ".");
    } else {
      System.out.println(cashDeskName + " je již uzavřená.");
    }
  }

  @Override
  public void performDuty() {
    if (!isLoggedIn()) {
      System.out.println(getName() + " se musí přihlásit, než může obsluhovat návštěvníky.");
      return;
    }

    if (cashDeskOpen) {
      System.out.println(getName() + " obsluhuje návštěvníky u pokladny " + cashDeskName + ".");
    } else {
      System.out.println(getName() + " čeká na otevření pokladny.");
    }
  }

  // Implementace metod z interface
  @Override
  public void startShift() {
    if (isLoggedIn()) {
      onShift = true;
      System.out.println(getName() + " zahájil/a směnu na " + cashDeskName + ".");
    } else {
      System.out.println(getName() + " se musí přihlásit před začátkem směny.");
    }
  }

  @Override
  public void endShift() {
    onShift = false;
    System.out.println(getName() + " ukončil/a směnu na " + cashDeskName + ".");
  }

  @Override
  public boolean isOnShift() {
    return onShift;
  }
}

