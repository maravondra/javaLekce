package com.v1.a_opakovani.other;

import com.v1.a_opakovani.Student;

public class MainOther {

    public static void main(String[] args) {
        Student student = new Student("Petr", 21, "tajneHeslo", "Informatika");

        student.zobrazStudenta();

        System.out.println("Jméno: " + student.jmeno); // ✅ Funguje - public
//        System.out.println("Věk: " + student.vek); //❌ NEFUNGUJE - protected není viditelné mimo dědičnou třídu
//        System.out.println("Heslo: " + student.heslo); //❌ NEFUNGUJE - private není viditelné vůbec

    }
}
