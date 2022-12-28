package com.kolosovvlad.betsesports.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping("/")
    public String securityPage(){
        return "vls";//from branch add-feature 1
    }

}
