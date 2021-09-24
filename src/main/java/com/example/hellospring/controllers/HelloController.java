package com.example.hellospring.controllers;

import com.example.hellospring.services.CalculateDayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    private CalculateDayService calculateDayService = new CalculateDayService();

    @GetMapping("/first-mapping")
    public String firstMapping(){
        return "Hello World";
    }

    @GetMapping("/second-mapping")
    public String secondMapping(){return "Second mapping";}

    @GetMapping("/")
    public String index(){return "Welcom to mu Spring Application";}

    @GetMapping("/parameter")
    public String parameter(@RequestParam String input){
        return input + " " + "End of String";
    }

    @GetMapping("/is-it-friday")
    public String friday(){
        return calculateDayService.firdayString();
    }
}

