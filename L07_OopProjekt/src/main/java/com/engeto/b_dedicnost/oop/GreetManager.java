package com.engeto.b_dedicnost.oop;

public class GreetManager {

    // varianta 1
    // mame pouze jednu metodu ktera vypise do konzole
    public void sayHelloV1() {
        System.out.println("Hello from manager");
    }

    // varianta 2
    // casteji ale mnohem lepsi nez jen vypisovat, tak te objekt (v tomto pripade String)
    // vratit a nechat na uzivateli co s tim chce delat
    public String sayHelloV2() {
        return "Hello from manager";
    }


    // jmeno
    // ale co když chceme abychom tam měli ještě uložené jméno
    public String name;

    public String sayHelloV3() {
        return String.format("Hello %s, from manager.", name);
    }

    // uplne dokonale
    private String nameOfUser;

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public String sayHelloV4() {
        return String.format("Hello %s, from manager", nameOfUser);
    }
}
