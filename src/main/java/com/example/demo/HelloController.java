package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Control all routes
@RestController
public class HelloController {
    // A GET Route
    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot 🚀";
    }

    // Path Variables Dynamic URLs
    @GetMapping("/hello/{name}")
    public String helloUser(@PathVariable String name) {
        return "Hello " + name + " 👋";
    }
}
