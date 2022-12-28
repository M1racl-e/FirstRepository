package com.kolosovvlad.betsesports.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecurityController {
    @PostMapping("/")
    public void securityPage() {
        System.out.println("Send going");
    }

    @GetMapping("/api")
    public void secr(){
        System.out.println("Sect");
    }
}
