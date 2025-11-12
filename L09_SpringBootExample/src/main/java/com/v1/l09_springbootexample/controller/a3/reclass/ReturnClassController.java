package com.v1.l09_springbootexample.controller.a3.reclass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("return")
public class ReturnClassController {

    @GetMapping("v1/return")
    public String getStringBack() {
        return "Hello from";
    }

    @GetMapping("v2/return")
    public User getUserBack() {
        return new User("Petr", 35, true);
    }

    @GetMapping("v3/return")
    public List<User> getUserList() {
        User petr = new User("Petr", 35, true);
        User david = new User("David", 45, false);
        List<User> userList = new ArrayList<>();
        userList.add(petr);
        userList.add(david);
        return userList;
    }

}
