package com.app.application_main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {

    @GetMapping("/index")
    public String showIndex() {
        return "redirect:/home"; // Esto puede causar el ciclo
    }
}