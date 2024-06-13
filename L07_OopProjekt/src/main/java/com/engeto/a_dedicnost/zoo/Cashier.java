package com.engeto.a_dedicnost.zoo;

public class Cashier extends User {

  private String office;

  private boolean isOpenCashier;

// moznost 1
//  public Cashier(String name, String password, int yearOfBoarding, String office) {
//    super(name, password, yearOfBoarding);
//    this.isOpenCashier = false;
//    this.office = office;
//  }


  // moznost 2 - lepsi
  public Cashier(String name, String password, int yearOfBoarding, String office) {
    this(name, password, yearOfBoarding, office, false);
  }

  public Cashier(String name, String password, int yearOfBoarding, String office,
      boolean isOpenCashier) {
    super(name, password, yearOfBoarding);
    this.office = office;
    this.isOpenCashier = isOpenCashier;
  }

  public boolean isOpenCashier() {
    return isOpenCashier;
  }

  public void setOpenCashier(boolean openCashier) {
    isOpenCashier = openCashier;
  }

  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }
}
