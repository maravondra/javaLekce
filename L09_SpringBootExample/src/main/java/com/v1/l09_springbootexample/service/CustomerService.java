package com.v1.l09_springbootexample.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {


    public UUID generateUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid;
    }

}
