package com.scotycode.OAuth2ResourceServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public String[] getUser(){
        return new String[]{"Boris","Kris","Klaus"};

    }
}
