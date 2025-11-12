package com.v2.b_ArrayList;

public class Giff implements Comparable<Giff> {

  private String title;
  private final Size size;
  private double price;

  public Giff(String title, Size size, double price) {
    this.title = title;
    this.size = size;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Gift{" +
        "price=" + price +
        ", size=" + size +
        ", title='" + title + '\'' +
        '}';
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
