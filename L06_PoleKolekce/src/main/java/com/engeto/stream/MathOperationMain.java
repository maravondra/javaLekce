package com.engeto.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

public class MathOperationMain {

  public static void main(String[] args) {
    List<Integer> number = Arrays.asList(1, 5, 7, 2, 6, 8);

    Integer max = Collections.max(number);
    System.out.println(max);
    System.out.println(Collections.min(number));

    // *** spocitat avarage *** /
    // bez pouziti streamu
    Double sum = 0.0;
    for (int i = 0; i < number.size(); i++) {
      sum += number.get(i);
    }
    System.out.println((sum / number.size()));

    // a pomoci streamu
    OptionalDouble average = number.stream().mapToDouble(a -> a).average();
    System.out.println(average);

    // spocitat sumu pomoci streamu
    System.out.println(number.stream().mapToDouble(a -> a).sum());


  }

}
