package com.v1.l09_springbootexample.controller.a4.uuid;


import com.v1.l09_springbootexample.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

// 3.3. @Autowired on Constructors
@RestController
@RequestMapping("uuid")
@RequiredArgsConstructor
public class UuidLombokController {


    private final CustomerService customerService;


    @GetMapping("v5/uuid")
    public UUID getUuid() {
        //CustomerService customerService = new CustomerService();
        return customerService.generateUUID();
    }
}
