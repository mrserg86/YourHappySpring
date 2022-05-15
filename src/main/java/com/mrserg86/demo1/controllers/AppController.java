package com.mrserg86.demo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/authenticated")
    public String au() {
        return "authenticated";
    }

    @GetMapping("/books")
    public String books() {
        return "books";
    }
}
