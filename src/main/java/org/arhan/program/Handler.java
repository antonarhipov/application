package org.arhan.program;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Handler {

  @GetMapping(path = "/")
  public String hello() {
    return "hello";
  }
}
