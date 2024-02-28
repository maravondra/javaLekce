package com.engeto.dedicnost;

/**
 * bezny uzivatel v zoo
 */

/*
  Vytvpro si beznehoe uzivatele u ktereho mame nasledujici atributy
      jmeno, heslo a datum nastupu - je logicke, ze tyto hodnoty jsou platne pro vsechny zamestnance v zoo, jak pro pokladni tak i pro osetrovatele
 */
public class User {

  private String name;
  public String password;
  protected int yearOfBoarding;

  public User(String name, String password, int yearOfBoarding) {
    this.name = name;
    this.password = password;
    this.yearOfBoarding = yearOfBoarding;
  }

  protected boolean logIn(String password) {
    return this.password.equals(password);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getYearOfBoarding() {
    return yearOfBoarding;
  }

  public void setYearOfBoarding(int yearOfBoarding) {
    this.yearOfBoarding = yearOfBoarding;
  }
}
