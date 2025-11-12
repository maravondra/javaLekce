package com.v1.d_map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

  public static void main(String[] args) {
    // vytvorime si slovnik
    Map<String, String> dictonary = new HashMap<>();

    dictonary.put("dog", "pes");
    dictonary.put("house", "dum");

    // keySet() - vrátí množinu klíčů,
    // entrySet() - vrátí množinu všech záznamů ve

    System.out.println(dictonary.entrySet());
    System.out.println(dictonary.keySet());

    for (String set : dictonary.keySet()) {
      System.out.println(set);
    }

    for (String set : dictonary.keySet()) {
      System.out.println(set + " " + dictonary.get(set));
    }

    // zjistit zda danne slovo existuje
    System.out.println(dictonary.containsKey("dog"));
    System.out.println(dictonary.containsKey("doga"));


  }

}
