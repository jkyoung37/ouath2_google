package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OAuth2UserController {
  @GetMapping({"", "/"})
  public String getAuthorizationMessage() {
    return "home";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @GetMapping({"/loginSuccess", "/board"})
  public String loginSuccess() {
    System.out.println("loginSuccess");
    return "board";
  }
}
