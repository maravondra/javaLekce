package com.v1.a_opakovani;

public class Student extends Osoba {

    private final String obor;

    public Student(String jmeno, int vek, String heslo, String obor) {
        super(jmeno, vek, heslo);
        this.obor = obor;
    }

    public void zobrazStudenta() {
        System.out.println("Jméno: " + jmeno); // ✅ Funguje - public
        System.out.println("Věk: " + vek);     // ✅ Funguje - protected (přístupný v potomkovi)

        // System.out.println("Heslo: " + heslo); ❌ NEFUNGUJE - private není dostupný mimo třídu Osoba

        System.out.println("Obor: " + obor);
    }

}
