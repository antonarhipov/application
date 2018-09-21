package org.arhan.program;

import org.arhan.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Handler {

  Component component = new Component();

  @GetMapping(path = "/")
  public String hello() {
    component.foo();
    return "hello2";
  }
}
