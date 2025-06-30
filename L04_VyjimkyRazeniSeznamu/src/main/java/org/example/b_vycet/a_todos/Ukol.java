package org.example.b_vycet.a_todos;

public class Ukol {

  private final String nazev;
  private final StavUkolu stav;

  public Ukol(String nazev, StavUkolu stav) {
    this.nazev = nazev;
    this.stav = stav;
  }

  public void zobraz() {
    System.out.println("📝 Úkol: " + nazev);
    // moznost zde rozsirit o dalsi informace
//    System.out.println("   Stav: " + stav);
    System.out.println("   Stav: " + stav + " - " + stav.getPopis());

    // cool reseni s barvou
    System.out.println("Popis: " + stav.getPopis());
    System.out.println("Priorita: " + stav.getPriorita());
    System.out.println("Barva pro zobrazení: " + stav.getBarva());

    System.out.println("Stav: " + stav.getObarvenyNazev() +
        " - " + stav.getPopis());

  }
}
