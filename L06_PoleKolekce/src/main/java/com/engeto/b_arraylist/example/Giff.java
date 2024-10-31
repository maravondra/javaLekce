package com.engeto.b_arraylist.example;

public class Giff implements Comparable<Giff> {

    private String description;
    private double price;

    public Giff(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Giff{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Giff second) {
        if ((this.getPrice() >= second.getPrice())) {
            return 1;
        } else {
            return -1;
        }
    }
}
