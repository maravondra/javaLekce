package com.engeto.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(1);
    numbers.add(2);
    numbers.add(1);

    numbers.forEach(System.out :: println);

    // get size
    System.out.println(numbers.size());

    // contains
    System.out.println(numbers.contains(1));
    System.out.println(numbers.contains(0)); // false protoze neexistuje

    numbers.clear();
    numbers.forEach(System.out::println);

    // vytvorime si Set pomoci predem definovanych hodnot
    Set<String> stringsSet = new HashSet<>(Arrays.asList("a", "b", "c"));

    // prevod na Array
    Object[] stringsSetAsArray = stringsSet.toArray();
    System.out.println(Arrays.toString(stringsSetAsArray));
  }
}
