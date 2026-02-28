package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// Control all routes
@RestController
public class HelloController {
    // A GET Route
    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot 🚀";
    }        
}
