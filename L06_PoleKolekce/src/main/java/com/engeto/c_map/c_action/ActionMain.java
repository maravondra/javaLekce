package com.engeto.c_map.c_action;

import java.util.HashMap;
import java.util.Map;

public class ActionMain {

    /*
    Představ si situaci, kdy sleduješ účastníky různých akcí. Můžeme použít HashMap pro uložení, které osoby se zúčastnily jakých akcí.

    Praktické využití: Tato struktura by mohla být součástí systému pro správu účastníků na konferencích, seminářích nebo jiných akcích, kde každý účastník je spojen s konkrétní akcí.
     */
    public static void main(String[] args) {
        // Vytvoření HashMap pro uchovávání účastníků a jejich akcí
        HashMap<String, String> participants = new HashMap<>();
        participants.put("Alice", "Konference 2025");
        participants.put("Bob", "Seminář 2025");
        participants.put("Charlie", "Konference 2025");

        // Iterace přes účastníky a akce
        for (Map.Entry<String, String> entry : participants.entrySet()) {
            System.out.println(entry.getKey() + " se zúčastnil " + entry.getValue());
        }
    }
}
