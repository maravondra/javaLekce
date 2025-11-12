package com.v1.g_record;

import java.time.LocalDate;
import java.util.List;

public record Invoice(

    String invoiceId,
    String customerName,
    LocalDate issueDate,
    double totalAmount,
    List<String> items
) {

}
