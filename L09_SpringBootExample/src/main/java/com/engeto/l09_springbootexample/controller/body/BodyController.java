package com.engeto.l09_springbootexample.controller.body;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("body")
public class BodyController {

    @PostMapping("v1/body")
    public String transfromStringBody(@RequestBody String name) {
        return "Name is " + name;
    }

    @PostMapping("v2/body")
    public String logIn(@RequestBody Login login) {
        return login.toString();
    }

    //not necessary
    @PostMapping("v3/body")
    public String logInWithoutBoyd(@RequestBody(required = false) Login login) {
        if (login == null) {
            return "body is missing";
        }
        return login.toString();
    }

    @PostMapping("v4/body")
    public String logInWithoutBodyOptional(@RequestBody Optional<Login> login) {
        if (login.isEmpty()) {
            return "body is missing";
        }
        return login.toString();
    }
}
