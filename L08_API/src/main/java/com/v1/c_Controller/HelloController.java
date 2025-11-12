package com.v1.c_Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
// Toto pridat az jako posledni a odmazat vsechny ostatni
@RequestMapping("hello")
public class HelloController {

  @GetMapping("hello")
  public String sayHello() {
    LocalDateTime now = LocalDateTime.now();

    return "Ahoj z controlleru. Aktualni cas je: " + now;
  }

  @GetMapping("hello/english")
  public String sayHelloEnglish() {
    return "Hello from controller. Current time is: " + LocalDateTime.now();
  }

  List<String> pozdravy = new ArrayList<>();

  @PutMapping("hello")
  public String addHellInList() {
    pozdravy.add("Hello");
    return "Hello was added in the list.";
  }

  @GetMapping("hello/list")
  public List<String> getAllGrettings() {
    return pozdravy;
  }

  @DeleteMapping("hello")
  public void clearList() {
    pozdravy.clear();
  }

  // Info: jen kdyz zbude čas, tak se dají přidat další metody
//  @RequestMapping(method = RequestMethod.PUT, value = "hello")
//  public String updateHello() {
//    return "Hello was updated";
//  }
//
//  @RequestMapping(method = RequestMethod.DELETE, value = "hello")
//  public String deleteHello() {
//    return "Hello was deleted";
//  }

}
