package com.v1.c_LinkedList.b_PrinterManagement;

public class PrintJob {

  String documentName;
  int pages;

  public PrintJob(String documentName, int pages) {
    this.documentName = documentName;
    this.pages = pages;
  }

  @Override
  public String toString() {
    return "Dokument: " + documentName + ", Stran: " + pages;
  }
}
