package com.kolosovvlad.betsesports.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping("/")
    public void securityPage() {
        System.out.println("All work"); //from master
    }
}
