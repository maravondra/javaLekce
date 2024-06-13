package com.engeto.c_rozhrani.compress;

public interface Kompresor {

  void compress();

  default void log() {
    System.out.println("Compress in file ... ");
  }

}
