package com.learning.spring.checklis_api.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/say-hello")
    public String helloWorld(@RequestParam(required = false) String name){

        return "Hello "+ (StringUtils.hasText(name) ? name : "World");
    }
}
