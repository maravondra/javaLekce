package org.example.c_sortArraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JednoducheRazeni {

  public static void main(String[] args) {
    List<Integer> cisla = Arrays.asList(5, 1, 9, 3, 2);
    System.out.println("Cisla: " + cisla);
    Collections.sort(cisla); // vzestupně
    System.out.println("Vzestupně: " + cisla);

    cisla.sort(Collections.reverseOrder()); // sestupně
    System.out.println("Sestupně: " + cisla);

    System.out.println("----------------------------");
    List<String> jmena = Arrays.asList("Petr", "Alena", "Zuzka", "Karel");
    System.out.printf("Jména: %s%n", jmena);
    Collections.sort(jmena);
    System.out.println("Seřazeno: " + jmena);
    Collections.sort(jmena, Collections.reverseOrder());
    System.out.println("Seřazeno sestupně: " + jmena);
  }

}
