package com.engeto.l09_springbootexample.controller.uuid;


import com.engeto.l09_springbootexample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

// 3.2. @Autowired on Setters
@RestController
@RequestMapping("uuid")
public class UuidSettersController {


    CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("v2/uuid")
    public UUID getUuid() {
        //CustomerService customerService = new CustomerService();
        return customerService.generateUUID();
    }
}
