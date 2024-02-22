package com.engeto.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMain {


  public static void main(String[] args) {

    List<String> nameInSchool = Arrays.asList("Marek", "Dan", "Tomas", "Helena", "Jana", "Eliska");

    // Task: vypsat pouze ty jmena, ktere jsou kratsi nebo rovna 4
    for (int i = 0; i < nameInSchool.size(); i++) {
      if (nameInSchool.get(i).length() <= 4) {
        System.out.println(nameInSchool.get(i));
      }
    }

    // a ted jednoduse pomoci streamu
    nameInSchool.stream()
        .filter(new Predicate<String>() {
          @Override
          public boolean test(String s) {
            return s.length() <= 4;
          }
        })
        .forEach(System.out::println);

    // odmazeme vsechno co neni potreba :)
    nameInSchool.stream()
        .filter((String oneElement) -> {
          return oneElement.length() <= 4;
        })
        .forEach(System.out::println);

    nameInSchool.stream()
        .filter(oneElement -> oneElement.length() <= 4)
        .forEach(System.out::println);

    // napriklad ulozit do jineho streamu pouze jmena zacinajici n
    // tentokrat nebude vypisovat ale ulozime to do jineho List
    List<String> onlyM = nameInSchool.stream()
        .filter(name -> name.startsWith("M"))
        .collect(Collectors.toList());

    onlyM.forEach(System.out::println);

    List<String> list = nameInSchool.stream()
        .filter(name -> name.startsWith("M"))
        .toList();

    // vymazat duplicitu
    List<Integer> listWithDuplicity = Arrays.asList(1, 1, 2, 2, 3, 3, 4);
    listWithDuplicity.forEach(System.out::println);

    List<Integer> listWithoutDuplicity = listWithDuplicity.stream().distinct().toList();
    listWithoutDuplicity.forEach(System.out::println);

  }
}
