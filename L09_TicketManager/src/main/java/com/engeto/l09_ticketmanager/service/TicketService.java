package com.v1.l09_ticketmanager.service;

import static com.v1.l09_ticketmanager.utils.QrGenerator.generateQrCode;

import com.v1.l09_ticketmanager.model.Ticket;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

@Service
public class TicketService {

    private final Map<UUID, Ticket> tickets = new HashMap<>();

    @Value("${ticket.eventName}")
    private String defaultEventName;

    @Value("${ticket.qr.output-path}")
    private String qrOutputPath;

    public Ticket createTicket(String name, String seat) throws IOException {
        UUID id = UUID.randomUUID();
        Ticket ticket = new Ticket(id, name, defaultEventName, seat);
        tickets.put(id, ticket);

        generateQrCode(id.toString(), qrOutputPath + "/" + id + ".png");
        return ticket;
    }

    public Ticket getTicket(UUID id) {
        return tickets.get(id);
    }

    public Ticket updateName(UUID id, String newName) {
        Ticket ticket = tickets.get(id);
        if (ticket != null) ticket.setName(newName);
        return ticket;
    }

    public boolean deleteTicket(UUID id) {
        return tickets.remove(id) != null;
    }

    public Optional<Ticket> getTicketById(UUID id) {
        return Optional.ofNullable(tickets.get(id));
    }
}