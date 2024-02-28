package com.engeto.rozhrani.example;

public class ZipCompress implements Kompresor {

  @Override
  public void compress() {
    System.out.println("Soubor se komprimuje formatem ZIP");
  }

  @Override
  public void log() {
    System.out.println(" do letadla");
  }
}
