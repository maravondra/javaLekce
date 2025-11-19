package com.v2.e_stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamExamples {

  public static void main(String[] args) {

    // 1️⃣ Vyfiltrování slov delších než 5 znaků
    List<String> words = List.of("auto", "programování", "Java", "stream", "lambda", "kód");

    List<String> longWords = words.stream()
        .filter(word -> word.length() > 5)
        .toList();

    System.out.println("Slova delší než 5 znaků: " + longWords);
    // Výstup: [programování, stream, lambda]

    // 2️⃣ Spočítání průměru čísel v seznamu
    List<Integer> numbers = List.of(5, 10, 15, 20, 25);

    OptionalDouble average = numbers.stream()
        .mapToInt(x -> x.intValue())
//        .mapToInt(Integer::intValue)
        .average();
    
    if (average.isPresent()) {
      System.out.println("Průměr čísel: " + average.getAsDouble());
    } else {
      System.out.println("Seznam je prázdný, nelze spočítat průměr.");
    }
    // Výstup: Průměr čísel: 15.0

    // 3️⃣ Nalezení největší hodnoty
    Optional<Integer> max = numbers
        .stream()
        .max((a, b) -> a.compareTo(b));
//        .max(Integer::compareTo);

    max.ifPresentOrElse(
        value -> System.out.println("Největší hodnota: " + value),
        () -> System.out.println("Seznam je prázdný.")
    );
    // Výstup: Největší hodnota: 25
  }
}
