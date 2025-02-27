package com.engeto.a_array;

import java.util.Arrays;
import java.util.Random;

public class ArrayMain {

    public static void main(String[] args) {
        System.out.println("Main for array");

        // deklara pole, kde budeme uchovavat velikost ruze v zahonku
        int[] heightRose;

        // zalozeni pole, kde musi byt definovana i velikost pole
        heightRose = new int[8];

        // pristup k je delam pomoci hranatych zavorek
        System.out.println("Vypis pred prirazenim: " + heightRose[0]);
        heightRose[0] = 30; // dulezite je rici ze se prvni pozice je index 0
        System.out.println("Vypis po prirazenim: " + heightRose[0]);

        heightRose[1] = 31;

        // tento radek skonci chybou, protoze maximalni index je 7
        //heightRose[8] = 38;

        // pro zajimavost, co se vypise bez zavorek
        System.out.println(heightRose);
        System.out.println('@' + Integer.toHexString(heightRose.hashCode()));
        System.out.println(heightRose.hashCode());

        // zjistit delku pole
        int lengthOfField = heightRose.length;
        System.out.println("This Java array size is: " + lengthOfField);

        // vypis pomoci for cyclu
        for (int i = 0; i < lengthOfField; i++) {
            System.out.print(heightRose[i] + " ");
        }

        // jeste muzeme vypsat pomoci foreach
        System.out.println();
        for (int oneElement : heightRose) {
            System.out.print(oneElement + " ");
        }

        // vypis pomoci knihovny Arrays
        System.out.println(Arrays.toString(heightRose));

        // naplnit pole pomoci for cyclu
        for (int i = 0; i < heightRose.length; i++) {
            heightRose[i] = i;
        }
        System.out.println(Arrays.toString(heightRose));

        for (int i = 0; i < heightRose.length; i++) {
            Random randomNumber = new Random();
            heightRose[i] = randomNumber.nextInt();
        }
        System.out.println(
                Arrays.toString(heightRose)
        );

        // naplneni rucne
        String[] simpsons = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
        System.out.println(Arrays.toString(simpsons));
        // co vypise nasledujici prikaz
        System.out.println(simpsons.length);
        // co vypise nasledujici prikaz
        System.out.println(simpsons[1]);

        // pouziti prikazu pro kopirovani z knihovny Arrays
        String[] simpsonovsCopy = Arrays.copyOfRange(simpsons, 0, 1);
        System.out.println(Arrays.toString(simpsonovsCopy));

        // serazeni pole pomoci knihovny Arrays
        Arrays.sort(simpsons);
        System.out.println(Arrays.toString(simpsons));
    }
}
