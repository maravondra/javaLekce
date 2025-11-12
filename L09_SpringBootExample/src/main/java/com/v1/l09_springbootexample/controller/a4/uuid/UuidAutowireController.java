package com.v1.l09_springbootexample.controller.a4.uuid;


import com.v1.l09_springbootexample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

// 3.1. @Autowired on Properties
@RestController
@RequestMapping("uuid")
public class UuidAutowireController {


    @Autowired
    CustomerService customerService;

    @GetMapping("v1/uuid")
    public UUID getUuid() {
        //CustomerService customerService = new CustomerService();
        return customerService.generateUUID();
    }
}
