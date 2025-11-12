package com.v1.l09_ticketmanager.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QrGenerator {

    public static void generateQrCode(String text, String filePath) throws IOException {
        try {
            BitMatrix matrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, 250, 250);
            Path path = Paths.get(filePath);
            Files.createDirectories(path.getParent());
            MatrixToImageWriter.writeToPath(matrix, "PNG", path);
        } catch (Exception e) {
            throw new IOException("Could not generate QR code", e);
        }
    }
}