package com.v2.e_stream.c_generate;

import java.util.function.DoubleSupplier;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;

public class GenerateStreamMain {

  private static final int MAX_GENERATE_NUMBER = 10;

  public static void main(String[] args) {

    DoubleStream generateDoubleStreamWith1 = DoubleStream.generate(new DoubleSupplier() {
      @Override
      public double getAsDouble() {
        return 1;
      }
    });

    /* pomoci abstraktni metody primo v forEach */
    //    generateDoubleStreamWith1.limit(10).forEach(new DoubleConsumer() {
    //      @Override
    //      public void accept(double value) {
    //        System.out.println(value);
    //      }
    //    });

    /* pomoci lambda vyrazu */
    //    generateDoubleStreamWith1.limit(10).forEach((name) -> {
    //      System.out.println(name);
    //    });

    /* Uplne zkracene*/
    generateDoubleStreamWith1.limit(10).forEach(System.out::println);


    /* generovat nahodna cisla pomoci abstraktni metody */
    DoubleStream generateDoubleStreamRandom = DoubleStream.generate(new DoubleSupplier() {
      @Override
      public double getAsDouble() {
        return Math.random();
      }
    });

    /* generovani nahodnych cisel pomoci lambda vyrazu */
    //    DoubleStream generateDoubleStreamRandom = DoubleStream.generate(() -> Math.random());

    generateDoubleStreamRandom.limit(MAX_GENERATE_NUMBER).forEach(System.out::println);


    /* A zde pouze na jeden radek */
    DoubleStream.generate(Math::random).limit(MAX_GENERATE_NUMBER).forEach(System.out::println);

    // generovani nekonecnych posloupnosti
    // iterate()

    // pomoci objektu
    DoubleUnaryOperator nasobekPoslopupnost = new DoubleUnaryOperator() {
      @Override
      public double applyAsDouble(double operand) {
        return operand * 2;
      }
    };

    DoubleStream.iterate(10, nasobekPoslopupnost).limit(MAX_GENERATE_NUMBER)
        .forEach(System.out::println);

    // pomoci abstraktni tridy
    DoubleStream.iterate(10, new DoubleUnaryOperator() {
          @Override
          public double applyAsDouble(double operand) {
            return operand * 2;
          }
        }).limit(MAX_GENERATE_NUMBER)
        .forEach(System.out::println);

    // a nakonec velmi jednoduse pomoci lambda vyrazu
    DoubleStream.iterate(10, operand -> operand * 2).limit(MAX_GENERATE_NUMBER)
        .forEach(System.out::println);


  }


}
