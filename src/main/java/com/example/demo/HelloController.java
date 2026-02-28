package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    // Query Parameters
    @GetMapping("/search")
    public String search(
        @RequestParam String keyword,
        @RequestParam int page 
    ) {
        return "Searching for " + keyword + ", page " + page;
    }

    // Returning JSON
    @GetMapping("/user") 
    public User getUser() {
        return new User(1, "Anmol");
    }
    
    // Mini Exercises
    // Sum
    @GetMapping("/add/{a}/{b}")
    public String getSum(@PathVariable int a, @PathVariable int b) {
        return "The sum of a: " + a + " and b: " + b + " = " + (a + b);
    }

    // Multiply
    @GetMapping("/multiply")
    public String getProduct(
        @RequestParam int a,
        @RequestParam int b
    ) {
        return "The Product of a: " + a + " and b: " + b + " = " + (a * b);
    }

    // Returns JSON
    @GetMapping("/profile/{name}/{age}")
    public Person getPerson(
        @PathVariable String name,
        @PathVariable int age
    ) {
        return new Person("Anmol", 25);
    }
}
