package cz.engeto.wedding.controller;


import cz.engeto.wedding.service.ReadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final ReadService readService;

    @GetMapping
    public String readUserInformation() throws IOException {
        return readService.readFile();
    }
}
