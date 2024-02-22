package com.engeto.array;

import java.util.Arrays;
import java.util.Base64;

public class Example {

  private static void displayField(String [][] field){
    for (int i = 0; i < field.length; i++) {
      System.out.println(Arrays.toString(field[i]));
    }
  }

  public static void main(String[] args) {
    // piskvorky
    String[][] tictactoc = new String [3][3];
    displayField(tictactoc);

    tictactoc[0][1] = "x";
    System.out.println("prvni tah");
    displayField(tictactoc);

    tictactoc[2][2] = "0";
    System.out.println("druhy tah");
    displayField(tictactoc);

    // jednoduchy priklad pro rozdeli stringu podle mezery
    String welcomString = "Welcome in Java Academy";
    String[] splitString = welcomString.split(" ");
    System.out.println(Arrays.toString(splitString));
    
    // funkce split se napriklad vyuziva pro dekodovani JW Tokenu
    String jwt = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    String[] splitJWT = jwt.split("\\.");
    String userData = splitJWT[1];
    System.out.println(userData);
    System.out.println(decodeJWT(userData));
  }
  public static final String decodeJWT(String base64String){
    Base64.Decoder decoder = Base64.getUrlDecoder();
    String payload = new String(decoder.decode(base64String));
    return payload;
  }
}
