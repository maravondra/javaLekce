package com.engeto.l09_springbootexample.controller.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("value")
public class ValueController {

    @Value("${engeto.name}")
    String engetoName;

    @Value("${engeto.noname:nothing}")
    String noname;

    @GetMapping("v1/value")
    public String getValue() {
        return engetoName;
    }

    @GetMapping("v2/value")
    public String getValueV2(@Value("${engeto.name.param}") String engetoName) {
        return engetoName;
    }

    @GetMapping("v3/value")
    public String getValueV3() {
        return noname;
    }
}
