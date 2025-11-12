package com.v2.a_array;

import java.util.Arrays;
import java.util.Random;

public class ArrayMain {

  public static void main(String[] args) {
    System.out.println("Main for array");
//🌱 Zahradnický / přírodní kontext
    int[] treeHeights;

    // zalozeni pole, kde musi byt definovana i velikost pole
    treeHeights = new int[8];

    // pristup k je delam pomoci hranatych zavorek
    System.out.println("Vypis pred prirazenim: " + treeHeights[0]);
    treeHeights[0] = 30; // dulezite je rici ze se prvni pozice je index 0
    System.out.println("Vypis po prirazenim: " + treeHeights[0]);

    treeHeights[1] = 31;

    // tento radek skonci chybou, protoze maximalni index je 7
    //treeHeights[8] = 38;

    // pro zajimavost, co se vypise bez zavorek
    System.out.println(treeHeights);
    System.out.println('@' + Integer.toHexString(treeHeights.hashCode()));
    System.out.println(treeHeights.hashCode());

    // zjistit delku pole
    int lengthOfField = treeHeights.length;
    System.out.println("This Java array size is: " + lengthOfField);

    // vypis pomoci for cyclu
    for (int i = 0; i < lengthOfField; i++) {
      System.out.print(treeHeights[i] + " ");
    }

    // jeste muzeme vypsat pomoci foreach
    System.out.println();
    for (int oneElement : treeHeights) {
      System.out.print(oneElement + " ");
    }

    // vypis pomoci knihovny Arrays
    System.out.println(Arrays.toString(treeHeights));

    // naplnit pole pomoci for cyclu
    for (int i = 0; i < treeHeights.length; i++) {
      treeHeights[i] = i;
    }
    System.out.println(Arrays.toString(treeHeights));

    for (int i = 0; i < treeHeights.length; i++) {
      Random randomNumber = new Random();
      treeHeights[i] = randomNumber.nextInt();
    }
    System.out.println(
        Arrays.toString(treeHeights)
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
