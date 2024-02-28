package com.engeto.oop;

public class MainOop {

  public static void main(String[] args) {

    System.out.println("Hello");

    //vytvoříme se manager, ktereho budeme učit zdravit
    GreetManager greetManager = new GreetManager();

    // tady trida HelloManager direkt vypise do console
    greetManager.sayHelloV1();

    // mnohem lepsi je, kdyz ta trida vrati jenom string a na tride, ktera to vola je rozhodnotu co s tim udelam
    // ulozi do promenne nebo vypise do console
    System.out.println(greetManager.sayHelloV2());

    // ted uz muzeme pridavat jmena
    greetManager.name = "marek";
    System.out.println(greetManager.sayHelloV3());

    // pomoci getter
    greetManager.setNameOfUser("marek vondra");
    System.out.println(greetManager.sayHelloV4());

    /**
     *  Zapouzdreni - v md souboru
     */

    /**
     * Konstruktory
     */

    /**
     * Abstrakce - v md souboru
     */

  }

}
