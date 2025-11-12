package com.v1.a_opakovani;

// Nadřazená třída Osoba
public class Osoba {
    public String jmeno;       // Přístupný odkudkoli
    protected int vek;         // Přístupný v dědičných třídách a stejném balíčku
    private final String heslo;      // Přístupný pouze v této třídě

    public Osoba(String jmeno, int vek, String heslo) {
        this.jmeno = jmeno;
        this.vek = vek;
        this.heslo = heslo;
    }

    public void zobrazInfo() {
        System.out.println("Jméno: " + jmeno);
        System.out.println("Věk: " + vek);
        System.out.println("Heslo: " + heslo); // Funguje, protože je uvnitř stejné třídy
    }
}
