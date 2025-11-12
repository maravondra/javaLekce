package com.v1.c_set.d_President;

import java.util.HashSet;
import java.util.Set;

public class PresidentMain {

  public static void main(String[] args) {
    President havel = new President("Vaclav", "Havel");
    President klaus = new President("Vaclav", "Klaus");
    President zeman = new President("Milos", "Zeman");
    President pavel = new President("Petr", "Pavel");

    Set<President> allPresidents = new HashSet<>();
    allPresidents.add(havel);
    allPresidents.add(havel);
    allPresidents.add(klaus);
    allPresidents.add(zeman);
    allPresidents.add(pavel);

    for (President onePresident : allPresidents) {
      System.out.printf("Name: %s, Surname: %s%n", onePresident.getName(),
          onePresident.getSurname());
    }

  }
}
