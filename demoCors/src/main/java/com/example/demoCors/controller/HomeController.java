package com.example.demoCors.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class HomeController {

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping
    public String name(@RequestParam String name) {
        return name;
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @PostMapping
    public StringBuilder nameRev(@RequestParam String name) {
        StringBuilder nameRev = new StringBuilder();
        for (int index = 1; index < name.length() + 1; index++) {
            nameRev.append(name.charAt(name.length() - index));
        }
        return nameRev;
    }
}
