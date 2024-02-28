package com.engeto.rozhrani.example;

public interface Kompresor {

  void compress();

  default void log() {
    System.out.println("Compress in file ... ");
  }

}
