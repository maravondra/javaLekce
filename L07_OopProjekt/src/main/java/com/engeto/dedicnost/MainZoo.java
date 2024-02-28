package com.engeto.dedicnost;

public class MainZoo {

  public static void main(String[] args) {

    // rekneme si ze chceme naprogramovat nejaky system pro zpravu nasich zamestanacu v zoo
    // budeme mít
    // Chovatele - Keeper
    // jmeno
    // heslo
    // rok nastupu
    // zvire o ktere pecuje
    // vahu tohoto zvirete
    // Pokladni - Cashier
    // jmeno
    // heslo
    // rok nastupu
    // cislo pokladny na kterem pracuje

    // vytvorit si zakladniho uzivatele
    User userMarek = new User("Marek", "ppp", 2022);
    System.out.println(userMarek.logIn("aaa"));
    System.out.println(userMarek.logIn("ppp"));
    System.out.println(userMarek.getName());

    // a ted si vytvorime naseho chovatele
    Keeper david = new Keeper("David", "add", 2023, "slon", 100);
    System.out.println(david.logIn("aad"));
    System.out.println(david.logIn("add"));
    System.out.println(" *** vypis parameter ***");
    System.out.println(david.getPassword());
    System.out.println(david.getName());
    System.out.println(david.getYearOfBoarding());
    System.out.println(" *** ---- *** ");
    System.out.println(david.getWeightOfMyAnimal());
    System.out.println(david.weightInPound());

    // a nakonec si vytvorime pokladni
    Cashier jana = new Cashier("Jana", "kkk", 2024, "pokladna1");
    System.out.println(jana.logIn("kkk"));
    System.out.println(jana.logIn("aaa"));
    System.out.println(jana.getOffice());

    // pozor ... dokonce muzeme priradit do rodice instanci potomka
    User pepa = new Cashier("Pepa", "dddd", 2000, "pokladna2");
    // nicmene tento objekt ma viditlne pouze metody a paramatery rodice
    // v tomto pripade jmeno, heslo, rok nastupu

    // nicmene to muzeme pretipovat
    Cashier pepaCashier = ((Cashier) pepa);
    // a tento objekt jiz ale ma viditlne ty metody cashier
    System.out.println(pepaCashier.getOffice());

    // jak otestovat nejaky objetk
    System.out.println(" Check of pepa");
    System.out.println("is user " + (pepa instanceof User));
    System.out.println("is cashier " + (pepa instanceof Cashier));
    System.out.println("is keeper " + (pepa instanceof Keeper));

    System.out.println(" Check of userMarek");
    System.out.println("is user " + (userMarek instanceof User));
    System.out.println("is cashier " + (userMarek instanceof Cashier));
    System.out.println("is keeper " + (userMarek instanceof Keeper));

    System.out.println(" Check of pepaCashier");
    System.out.println("is user " + (pepaCashier instanceof User));
    System.out.println("is cashier " + (pepaCashier instanceof Cashier));

  }

}
