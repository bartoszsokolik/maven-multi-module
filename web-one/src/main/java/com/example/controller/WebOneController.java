package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebOneController {

    @GetMapping
    public String getMessage() {
        return "Hello from web-one module";
    }
}
