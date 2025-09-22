// com/semo/controller/HomeController.java
package com.semo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping({"/", "/landing"})
  public String landing() {
    return "landing";
  }

  // ★ /main 은 여기서만 처리
  @GetMapping("/main")
  public String main() {
    return "main";
  }
}
