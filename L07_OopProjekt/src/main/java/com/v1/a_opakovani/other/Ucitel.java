package com.v1.a_opakovani.other;

import com.v1.a_opakovani.Osoba;

public class Ucitel extends Osoba {

    private final String predment;
    

    public Ucitel(String jmeno, int vek, String heslo, String predment) {
        super(jmeno, vek, heslo);
        this.predment = predment;
    }

    public void zobrazStudenta() {
        System.out.println("Jméno: " + jmeno); // ✅ Funguje - public
        System.out.println("Věk: " + vek);     // ✅ Funguje - protected (přístupný v potomkovi)

        // System.out.println("Heslo: " + heslo); ❌ NEFUNGUJE - private není dostupný mimo třídu Osoba

        System.out.println("Predment: " + predment);
    }
}
