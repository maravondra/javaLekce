package com.v1.l09_ticketmanager.model;

import java.util.UUID;

public class Ticket {
    private UUID id;
    private String name;
    private String event;
    private String seat;

    public Ticket() {}

    public Ticket(UUID id, String name, String event, String seat) {
        this.id = id;
        this.name = name;
        this.event = event;
        this.seat = seat;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEvent() { return event; }
    public void setEvent(String event) { this.event = event; }

    public String getSeat() { return seat; }
    public void setSeat(String seat) { this.seat = seat; }
}