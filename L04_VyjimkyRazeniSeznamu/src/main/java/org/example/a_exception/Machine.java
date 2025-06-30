package org.example.a_exception;

public class Machine {

  private int itemsProduced;

  public void setItemsProduced(int itemsProduced) {
    if (itemsProduced < 0) {
      throw new IllegalArgumentException(
          "Počet položek nesmí být záporný! Zadáno: " + itemsProduced);
    }
    this.itemsProduced = itemsProduced;
  }

  public int getItemsProduced() {
    return itemsProduced;
  }
}
