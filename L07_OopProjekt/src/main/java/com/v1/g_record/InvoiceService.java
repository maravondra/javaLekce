package com.v1.g_record;

import java.time.LocalDate;
import java.util.List;

public class InvoiceService {

  public Invoice generateInvoice() {
    return new Invoice(
        "INV-2025-001",
        "Anna Nováková",
        LocalDate.now(),
        1499.50,
        List.of("Notebook", "Myš", "Podložka")
    );
  }

  public void printInvoice(Invoice invoice) {
    System.out.println("Faktura č.: " + invoice.invoiceId());
    System.out.println("Zákazník: " + invoice.customerName());
    System.out.println("Datum vystavení: " + invoice.issueDate());
    System.out.println("Položky:");
    for (String item : invoice.items()) {
      System.out.println(" - " + item);
    }
    System.out.println("Celkem k úhradě: " + invoice.totalAmount() + " Kč");
  }
}
