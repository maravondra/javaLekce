package com.engeto.d_rozhrani.MathShape;


class Square implements Shape {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateSurface() {
        return side * side;
    }
}