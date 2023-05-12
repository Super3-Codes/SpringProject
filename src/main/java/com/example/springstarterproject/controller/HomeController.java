package com.example.springstarterproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Hello(){
        return "This a spring project";
    }
    @GetMapping ("/greeting")
    public String greeting(@RequestParam(name = "name",required = false,defaultValue = "Sador") String name, Model model){
        model.addAttribute("name",name);
        return "greeting";
    }


}
