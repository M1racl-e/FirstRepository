package com.kolosovvlad.betsesports.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class SecurityController {
    @GetMapping("/")
    public void securityPage() {
        System.out.println("Delete all Prodject");
    }
}
