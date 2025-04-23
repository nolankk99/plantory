package com.plantory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Plantory - 도심 속 작은 숲을 집 안으로");
        return "index";
    }
    
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Plantory - 소개");
        return "about";
    }
}