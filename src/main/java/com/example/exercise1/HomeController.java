package com.example.exercise1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/crabcake")
    public String crabCake(){
        return "crabcake";
    }

    @RequestMapping("/pancakes")
    public String pancakes(){
        return "pancakes";
    }
}
