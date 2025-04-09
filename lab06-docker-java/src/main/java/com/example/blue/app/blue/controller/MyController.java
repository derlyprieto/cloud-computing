package com.example.blue.app.blue.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/api/test")
public class MyController {

    @Value("${environment.name}")
    String environment;

    MyController(){}

    @GetMapping
    String getEnvironment() {
        return this.environment;
    }
}
