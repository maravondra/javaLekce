package com.engeto.rozhrani.example;

public class MainCompress {

  public static void main(String[] args) {
    RarCompress rarCompress = new RarCompress();
    rarCompress.log();
    rarCompress.compress();

    ZipCompress zipCompress = new ZipCompress();
    zipCompress.log();
    zipCompress.compress();
  }
}
