package org.example.a_exception;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExceptionsMain {

  public static int divideBaseBy(
      int base, int divisor
  ) {
    int result = 0;
    try {
      result = base / divisor;
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero!");
      // Rethrow the exception to be handled by the caller
      throw e;
    }
    return result;
  }

  public static void main(String[] args) {
    double first = divideBaseBy(10, 2);
    System.out.println(first);

// *** not correct code, it will throw an exception and toto vyjimka neni osetrena
    double second = divideBaseBy(10, 0);
    System.out.println(second);

    // *** correct code, it will throw an exception and this exception is handled
//    try {
//      // This will throw an ArithmeticException
//      double second = divideBaseBy(10, 0);
//      System.out.println(second);
//    } catch (ArithmeticException e) {
//      System.out.println("Cannot divide by zero!");
//    }

    double third = divideBaseBy(10, 3);
    System.out.println(third);
  }
}