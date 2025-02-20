package com.engeto.c_map.b_price;

import java.util.HashMap;

public class PriceMain {

    /*
    Představ si e-commerce aplikaci, kde HashMap uchovává produkty a jejich ceny. Pomocí containsKey() můžeme zkontrolovat, jestli je produkt v nabídce, a containsValue() pro kontrolu, zda existuje produkt za určitou cenu.

    Praktické využití: Tento příklad je vhodný pro e-shop, kde kontrolujeme, jestli máme produkt skladem nebo jestli existuje nějaký produkt za určitou cenu.
     */

    public static void main(String[] args) {
        // Vytvoření HashMap pro produkty a jejich ceny
        HashMap<String, Double> products = new HashMap<>();
        products.put("Laptop", 799.99);
        products.put("Smartphone", 499.99);
        products.put("Tablet", 299.99);

        // Kontrola, zda máme v nabídce "Smartphone"
        if (products.containsKey("Smartphone")) {
            System.out.println("Smartphone je k dispozici.");
        }

        // Kontrola, zda nějaký produkt stojí 499.99
        if (products.containsValue(499.99)) {
            System.out.println("Máme produkt za 499.99.");
        }
    }
}
