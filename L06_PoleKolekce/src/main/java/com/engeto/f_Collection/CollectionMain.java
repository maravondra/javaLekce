package com.engeto.f_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMain {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(5, 10, 3, 8, 15));


        // Nalezení minima a maxima
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        // Výpis výsledků
        System.out.println("Minimální hodnota: " + min);
        System.out.println("Maximální hodnota: " + max);

        // neco co je vice z praxe
        // Inicializace ArrayListu s teplotami naměřenými během dne
        ArrayList<Double> dailyTemperatures = new ArrayList<>(List.of(16.5, 20.3, 18.2, 21.4, 19.6, 15.8));

        // Nalezení minimální a maximální teploty
        double minTemperature = Collections.min(dailyTemperatures);
        double maxTemperature = Collections.max(dailyTemperatures);

        /** Collections.sort(List<T> list) **/
        List<String> names = new ArrayList<>(List.of("Eva", "Adam", "Pavel", "Lenka"));
        Collections.sort(names);
        System.out.println("Seřazené jména: " + names); // Výstup: [Adam, Eva, Lenka, Pavel]

        /** Collections.reverse(List<?> list) **/
        List<Integer> numbersReverse = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Collections.reverse(numbersReverse);
        System.out.println("Obrácené pořadí: " + numbersReverse); // Výstup: [5, 4, 3, 2, 1]

        /** Collections.shuffle(List<?> list) **/
        List<String> cards = new ArrayList<>(List.of("Hearts", "Diamonds", "Clubs", "Spades"));
        Collections.shuffle(cards);
        System.out.println("Zamíchané karty: " + cards); // Pořadí se mění při každém spuštění

        /** Collections.frequency(Collection<?> c, Object o) **/
        List<String> colors = new ArrayList<>(List.of("Red", "Blue", "Red", "Green", "Blue", "Red"));
        int redCount = Collections.frequency(colors, "Red");
        System.out.println("Počet 'Red': " + redCount); // Výstup: 3

        /** Collections.replaceAll(List<T> list, T oldVal, T newVal)**/
        List<String> items = new ArrayList<>(List.of("Apple", "Banana", "Apple", "Orange"));
        Collections.replaceAll(items, "Apple", "Mango");
        System.out.println("Po nahrazení: " + items); // Výstup: [Mango, Banana, Mango, Orange]

        /** Collections.fill(List<? super T> list, T obj) **/
        List<String> slots = new ArrayList<>(Arrays.asList(new String[5]));
        Collections.fill(slots, "Reserved");
        System.out.println("Zaplněný seznam: " + slots); // Výstup: [Reserved, Reserved, Reserved, Reserved, Reserved]

        /** Collections.disjoint(Collection<?> c1, Collection<?> c2)**/
        List<String> list1 = List.of("Apple", "Banana");
        List<String> list2 = List.of("Cherry", "Mango");
        boolean areDisjoint = Collections.disjoint(list1, list2);
        System.out.println("Seznamy nemají společné prvky: " + areDisjoint); // Výstup: true


    }
}