package com.v1.f_stack;

import java.util.Stack;

public class StackExample {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    stack.push("Java");
    stack.push("Python");
    stack.push("C++");

    System.out.println(stack.peek()); // C++
    System.out.println(stack.pop());  // C++
    System.out.println(stack.pop());  // Python
    System.out.println(stack.empty()); // false
  }
}
