package com.engeto.l09_springbootexample.controller.status;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("status")
public class StatusController {

    @GetMapping("v1/status")
    public ResponseEntity getStatusV1() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("v2/status")
    public ResponseEntity getStatusWithReturn() {
        return new ResponseEntity("ok", HttpStatus.OK);
    }

    @GetMapping("v3/status")
    public ResponseEntity getStatusWithClass() {
        User marek = new User("marek", 22, true);
        return new ResponseEntity(marek, HttpStatus.OK);
    }

    @GetMapping("v4/status")
    public ResponseEntity getStatus201WithClass() {
        User marek = new User("marek", 22, true);
        return new ResponseEntity(marek, HttpStatus.CREATED);
    }

}
