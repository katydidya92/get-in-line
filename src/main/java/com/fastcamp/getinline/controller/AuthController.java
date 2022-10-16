package com.fastcamp.getinline.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AuthController {

    @GetMapping("/sign-up")
    public String signUp() {
        return "auth/sign-up";
    }

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

}
