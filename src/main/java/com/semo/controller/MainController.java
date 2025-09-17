package com.semo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

  @Controller
  @RequestMapping("/main")
  public class MainController {
    //창고이음 소개 페이지
    @GetMapping({"/introduce", "/introduce/"})
    public String introduce() {
      return "main/introduce";
    }
  }