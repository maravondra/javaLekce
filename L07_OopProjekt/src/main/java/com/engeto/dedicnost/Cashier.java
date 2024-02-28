package com.engeto.dedicnost;

public class Cashier extends User {

  private String office;


  public Cashier(String name, String password, int yearOfBoarding, String office) {
    super(name, password, yearOfBoarding);
    this.office = office;
  }

  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }
}
