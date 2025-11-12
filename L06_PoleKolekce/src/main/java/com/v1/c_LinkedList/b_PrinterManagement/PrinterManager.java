package com.v1.c_LinkedList.b_PrinterManagement;

import java.util.LinkedList;

public class PrinterManager {

  public static void main(String[] args) {
    // Vytvoření LinkedList jako fronty tiskových úloh
    LinkedList<PrintJob> printQueue = new LinkedList<>();

    // Přidání tiskových úloh do fronty (na konec)
    printQueue.add(new PrintJob("Dokument1.pdf", 10));
    printQueue.add(new PrintJob("Dokument2.docx", 5));
    printQueue.add(new PrintJob("Dokument3.pptx", 20));
    System.out.println("Po přidání úloh do fronty: " + printQueue);

    // Zpracování první tiskové úlohy (FIFO)
    PrintJob firstJob = printQueue.poll();  // Odstraní a vrátí první úlohu
    System.out.println("Zpracováno: " + firstJob);
    System.out.println("Po zpracování první úlohy: " + printQueue);

    // Zpracování dalších úloh ve frontě
    PrintJob secondJob = printQueue.poll();
    System.out.println("Zpracováno: " + secondJob);
    System.out.println("Po zpracování druhé úlohy: " + printQueue);

    // Přidání nové tiskové úlohy
    printQueue.add(new PrintJob("Dokument4.xlsx", 15));
    System.out.println("Po přidání nové úlohy: " + printQueue);

    // Zpracování zbývajících úloh
    while (!printQueue.isEmpty()) {
      PrintJob nextJob = printQueue.poll();
      System.out.println("Zpracováno: " + nextJob);
    }
    System.out.println("Všechny úlohy byly zpracovány.");
  }
}
