package com.engeto.oop;

public class Hello {

  private String text;

  public Hello(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String sayHello(String name) {
    return String.format("%s %s", text, name);
  }
}
