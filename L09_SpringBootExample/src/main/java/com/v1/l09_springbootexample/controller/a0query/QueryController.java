package com.v1.l09_springbootexample.controller.a0query;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class QueryController {

  @GetMapping("v1/name")
  public String sayNameV1(@RequestParam String surname) {
    return "Say hello to " + surname;
  }

  @GetMapping("v2/name")
  public String sayNameV2(@RequestParam("surname") String surnameOfClient) {
    return "Say hello to " + surnameOfClient;
  }

  @GetMapping("v3/name")
  public String sayNameV3(@RequestParam(value = "surname") String surnameOfClient) {
    return "Say hello to " + surnameOfClient;
  }

  @GetMapping("v4/name")
  public String sayNameV4(
      @RequestParam(value = "surname", required = false) String surnameOfClient
  ) {
    return "Say hello v4 to " + surnameOfClient;
  }

  @GetMapping("v5/name")
  public String sayNameV5(
      @RequestParam(value = "surname", required = false) String surnameOfClient
  ) {
    String sayString = "Say welcome";
    if (surnameOfClient != null) {
      sayString = sayString.concat(" to ").concat(surnameOfClient);
    }
    return sayString;
  }

  @GetMapping("v6/name")
  public String sayNameV6(
      @RequestParam(name = "surname") Optional<String> surnameOfClient) {
       /* String sayString = "Say welcome";
        if(surnameOfClient.isEmpty()){
            sayString = sayString.concat(" to ").concat(surnameOfClient.get());
        }
        return sayString;*/
    return "Say welcome " + surnameOfClient.orElseGet(() -> "");
  }

  @GetMapping("v7/name")
  public String sayNameV7(
      @RequestParam(name = "surname", defaultValue = "marek") String surnameOfCLient
  ) {
    return "Say hello " + surnameOfCLient;
  }

  @GetMapping("v8/name")
  public String sayNameV8(
      @RequestParam(name = "surname") String surnameOfClient,
      @RequestParam(name = "age") Long ageOfClient
  ) {
    return "Say hello to " + surnameOfClient + " age " + ageOfClient;
  }

  @GetMapping("v9/name")
  public String sayNameV9(
      @RequestParam(name = "surname") List<String> listOfClient
  ) {
    return listOfClient.toString();
  }
}
