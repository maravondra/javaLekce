package com.engeto.c_rozhrani.MathShape;

class Circle implements Shape {

  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateSurface() {
    return Math.PI * radius * radius;
  }
}
