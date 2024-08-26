package com.app.application_main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {
// Recordar eque el metodo se debe llamar igual que la vista
    @GetMapping("/index")
    public String home() {
        return "home"; // Esto puede causar el ciclo
    }
}