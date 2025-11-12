package com.v1.d_rozhrani.compress;

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
