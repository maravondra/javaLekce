package com.engeto.l09_springbootexample.controller.a5.value;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("value")

public class ValueController {

  // vytvorit logger pres objekt
  Logger logger = LoggerFactory.getLogger(ValueController.class);


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
    logger.trace("A TRACE Message");
    logger.debug("A DEBUG Message");
    logger.info("An INFO Message");
    logger.warn("A WARN Message");
    logger.error("An ERROR Message");

    return noname;
  }
}
