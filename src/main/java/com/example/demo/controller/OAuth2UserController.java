package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.annotation.SocialUser;
import com.example.demo.model.User;

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

  @GetMapping("/board")
  public String board() {
    return "board";
  }

  @GetMapping("/loginSuccess")
  public String loginComplete(@SocialUser User user) {
    return "redirect:/board";
  }
}
