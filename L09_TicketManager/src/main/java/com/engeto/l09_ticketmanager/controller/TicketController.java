package com.v1.l09_ticketmanager.controller;


import com.v1.l09_ticketmanager.model.Ticket;
import com.v1.l09_ticketmanager.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket input) throws IOException {
        return ticketService.createTicket(input.getName(), input.getSeat());
    }

    @GetMapping
    public Ticket getTicket(@RequestParam UUID id) {
        return ticketService.getTicket(id);
    }

    @PutMapping
    public Ticket updateName(@RequestParam UUID id, @RequestBody Ticket input) {
        return ticketService.updateName(id, input.getName());
    }

    @DeleteMapping
    public String deleteTicket(@RequestParam UUID id) {
        return ticketService.deleteTicket(id) ? "Deleted" : "Not found";
    }
}