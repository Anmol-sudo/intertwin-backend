package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {
    public User getUser(String name, int age) {
        return new User(22, "Anmol");
    }
}
