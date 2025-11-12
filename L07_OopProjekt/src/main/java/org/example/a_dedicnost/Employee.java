package org.example.a_dedicnost;

/**
 * Reprezentuje obecného zaměstnance zoo.
 * <p>
 * 🧱 1. Abstraktní třída Employee
 * <p>
 * - Třída Employee představuje nadtřídu všech zaměstnanců.
 * <p>
 * - Obsahuje společné vlastnosti(name, password, yearOfHire) a společnou logiku (logIn, logOut).
 * <p>
 * - Metoda performDuty() je abstraktní → každý zaměstnanec ji musí implementovat po svém.
 */
public abstract class Employee {

  private final String name;
  private final String password;
  private final int yearOfHire;
  private boolean loggedIn; // nový atribut


  public Employee(String name, String password, int yearOfHire) {
    this.name = name;
    this.password = password;
    this.yearOfHire = yearOfHire;
    this.loggedIn = false;
  }

  public String getName() {
    return name;
  }

  public int getYearOfHire() {
    return yearOfHire;
  }

  public boolean isLoggedIn() {
    return loggedIn;
  }

  public boolean logIn(String enteredPassword) {
    if (password.equals(enteredPassword)) {
      loggedIn = true;
      System.out.println(name + " byl úspěšně přihlášen.");
      return true;
    } else {
      System.out.println(name + " zadal nesprávné heslo.");
      return false;
    }
  }

  /**
   * Abstraktní metoda - každý zaměstnanec vykonává jinou práci
   */
  public abstract void performDuty();

  /**
   * Volitelná metoda - lze přepsat
   */
  public void logOut() {
    if (loggedIn) {
      loggedIn = false;
      System.out.println(name + " se odhlásil ze systému.");
    } else {
      System.out.println(name + " nebyl přihlášen.");
    }
  }
}

