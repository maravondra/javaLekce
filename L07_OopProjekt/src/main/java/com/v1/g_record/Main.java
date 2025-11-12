package com.v1.g_record;

public class Main {

  public static void main(String[] args) {
    InvoiceService service = new InvoiceService();
    Invoice invoice = service.generateInvoice();
    service.printInvoice(invoice);
  }

  /*
      record slouží jako efektivní datový kontejner
      Není třeba psát gettery, toString, equals, hashCode
      Objekt je neměnný – ideální pro důvěryhodný přenos dat
      Lze snadno používat ve službách, controllerech, exportech atd.
   */
}
