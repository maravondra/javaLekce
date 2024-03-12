package com.engeto.easy_example.controler;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {


    @GetMapping("hello")
    public String sayHello() {
        return "Hello engeto from controller";
    }

    @GetMapping("hellowithname")
    public String sayHelloWithName(@RequestParam(value = "name", required = false) String name) {
        return name + " say from controller via query";
    }

    @GetMapping("hellowithnameandusername")
    public String sayHelloWithNameAndSurname(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "surname", required = false) String surname) {
        return surname + " " + name + " say from controller via query";
    }

    @GetMapping(value = "hello/value")
    public String sayHelloValue() {
        return "hello with value";
    }

    @GetMapping(path = "hello/path")
    public String sayHelloPath() {
        return "hello with path";
    }

    @GetMapping(path = "hello/params", params = "name")
    public String sayHelloParams() {
        return "hello with params";
    }

    @RequestMapping(value = "request", method = RequestMethod.GET)
    @ResponseBody
    public String sayHelloWithRequest() {
        return "hello with request";
    }

    //Remember, we don’t need to annotate the @RestController-annotated controllers with the @ResponseBody annotation since Spring does it by default.
    @GetMapping(value = "responsev1")
    @ResponseBody
    public ResponseTransfer getWithAnnotation() {
        return new ResponseTransfer("Thanks For Posting!!!");
    }

    @GetMapping(value = "v2/response")
    public ResponseTransfer getWithoutAnnotation() {
        return new ResponseTransfer("Thanks For Posting!!!");
    }


}
