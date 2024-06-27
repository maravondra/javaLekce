package com.engeto.c_Controller;

@RestController
@RequestMapping("api/v1/")
public class HelloController {

  @GetMapping("hello")
  public String sayHello() {
    return "Hello from controller";
  }

  @PostMapping("hello")
  public String createNewHello() {
    return "New hello was created";
  }

  @RequestMapping(method = RequestMethod.PUT, value = "hello")
  public String updateHello() {
    return "Hello was updated";
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "hello")
  public String deleteHello() {
    return "Hello was deleted";
  }

  @GetMapping("hellode")
  public String sayHelloDe() {
    return "Begrusen von controller";
  }


  @GetMapping("say/hello")
  public String sayHelloV1() {
    return "Hello v1";
  }
}
