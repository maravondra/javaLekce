package com.v1.l09_ticketmanager.controller;


import com.v1.l09_ticketmanager.model.Ticket;
import com.v1.l09_ticketmanager.service.TicketService;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@RequestMapping("/qrcode")
public class QRCodeController {

  @Autowired
  private TicketService ticketService;

  @GetMapping(produces = MediaType.IMAGE_PNG_VALUE)
  public ResponseEntity<byte[]> generateQr(@RequestParam String text) {
    return createQrCodeFromText(text);
  }

  @GetMapping(value = "/{id}", produces = MediaType.IMAGE_PNG_VALUE)
  public ResponseEntity<byte[]> generateQrFromTicket(@PathVariable UUID id) {
    Optional<Ticket> optionalTicket = ticketService.getTicketById(id);
    if (optionalTicket.isEmpty()) {
      return ResponseEntity.notFound().build();
    }

    Ticket ticket = optionalTicket.get();
    String qrContent = ticket.toString(); // nebo třeba: ticket.getTitle() + " - " + ticket.getOwner()

    return createQrCodeFromText(qrContent);
  }


  private ResponseEntity<byte[]> createQrCodeFromText(String text) {
    try {
      int width = 300;
      int height = 300;

      QRCodeWriter qrCodeWriter = new QRCodeWriter();
      BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      MatrixToImageWriter.writeToStream(bitMatrix, "PNG", outputStream);

      byte[] qrBytes = outputStream.toByteArray();

      return ResponseEntity.ok()
          .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"qrcode.png\"")
          .contentType(MediaType.IMAGE_PNG)
          .body(qrBytes);

    } catch (WriterException | IOException e) {
      return ResponseEntity.status(500).build();
    }
  }
}
