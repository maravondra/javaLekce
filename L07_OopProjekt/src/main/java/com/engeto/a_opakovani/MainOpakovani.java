package com.engeto.a_opakovani;

public class MainOpakovani {

    public static void main(String[] args) {
        Student student = new Student("Petr", 21, "tajneHeslo", "Informatika");

        student.zobrazStudenta();

        System.out.println("Jméno: " + student.jmeno); // ✅ Funguje - public
        System.out.println("Věk: " + student.vek); //✅ Funguje - protected je ve stejnem balicku
//        System.out.println("Heslo: " + student.heslo); //❌ NEFUNGUJE - private není viditelné vůbec

    }
}
