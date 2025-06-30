package org.example.a_exception;


public class ExceptionsMachineMain {


  public static void main(String[] args) {
    Machine machine = new Machine();
    try {
      machine.setItemsProduced(10);
      machine.setItemsProduced(-1);
      machine.setItemsProduced(15);
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
    System.out.println(machine.getItemsProduced());
  }
}
