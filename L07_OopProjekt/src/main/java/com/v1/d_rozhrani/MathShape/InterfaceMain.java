package com.v1.d_rozhrani.MathShape;

public class InterfaceMain {

    // Rozhraní pro tvary

    // Implementace rozhraní pro kruh

    // Implementace rozhraní pro čtverec


    public static void main(String[] args) {

        //V tomto příkladu máme rozhraní Tvar, které obsahuje jedinou abstraktní metodu vypocetPlochy(). Třídy Kruh a Ctverec implementují toto rozhraní a poskytují svou vlastní implementaci metody vypocetPlochy(). Ve funkci main() pak můžeme vytvořit instance těchto tříd a volat jejich metodu vypocetPlochy(), abychom získali výsledky výpočtu plochy pro dané tvary.
        //
        //Rozhraní v tomto případě poskytuje jasnou a jednoduchou smlouvu, kterou musí třídy dodržovat. Díky tomu můžeme snadno vytvářet nové tvary a zajistit, že budou schopny provádět požadované operace, jako je výpočet plochy.
        Circle circle = new Circle(10);
        Square square = new Square(50);

        System.out.println("Plocha kruhu je " + circle.calculateSurface());
        System.out.println("Plocha cterce je " + square.calculateSurface());

    }

}
