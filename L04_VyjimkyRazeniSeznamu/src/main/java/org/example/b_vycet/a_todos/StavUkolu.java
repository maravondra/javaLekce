package org.example.b_vycet.a_todos;

public enum StavUkolu {

  // jednoduche reseni
//  NOVY,
//  PROBIHA,
//  HOTOVO,
//  BLOKOVANO

  // rozsirene reseni s popisem
//  NOVY("Úkol byl právě vytvořen"),
//  PROBIHA("Úkol je ve zpracování"),
//  HOTOVO("Úkol byl dokončen"),
//  BLOKOVANO("Úkol je zablokovaný");
//
//  private final String popis;
//
//  StavUkolu(String popis) {
//    this.popis = popis;
//  }
//
//  public String getPopis() {
//    return popis;
//  }

  // Uplne cool reseni
//  NOVY("Úkol byl právě vytvořen", 3, "modrá"),
//  PROBIHA("Úkol je ve zpracování", 2, "žlutá"),
//  HOTOVO("Úkol byl dokončen", 1, "zelená"),
//  BLOKOVANO("Úkol je zablokovaný", 4, "červená");

  NOVY("Úkol byl právě vytvořen", 3, "\u001B[34m"),      // modrá
  PROBIHA("Úkol je ve zpracování", 2, "\u001B[33m"),     // žlutá
  HOTOVO("Úkol byl dokončen", 1, "\u001B[32m"),          // zelená
  BLOKOVANO("Úkol je zablokovaný", 4, "\u001B[31m");     // červená

  private final String popis;
  private final int priorita;
  private final String barva;

  StavUkolu(String popis, int priorita, String barva) {
    this.popis = popis;
    this.priorita = priorita;
    this.barva = barva;
  }

  public String getPopis() {
    return popis;
  }

  public int getPriorita() {
    return priorita;
  }

  public String getBarva() {
    return barva;
  }

  public String getObarvenyNazev() {
    return barva + this.name() + "\u001B[0m";
  }
}
