package com.example.flight_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {

    @GetMapping("/flight")
    public String getData() {
        return "Please book all your flights from Yatra at 20% discount!";
    }
}