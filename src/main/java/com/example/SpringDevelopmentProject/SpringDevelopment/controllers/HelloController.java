package com.example.SpringDevelopmentProject.SpringDevelopment.controllers;

import com.example.SpringDevelopmentProject.SpringDevelopment.dto.GreetingMessage;
import com.example.SpringDevelopmentProject.SpringDevelopment.services.GreetingService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/hello")
public class HelloController {
    private final GreetingService greetingService;
    public HelloController(GreetingService greetingService){
        this.greetingService=greetingService;
    }
//    @GetMapping
//    public GreetingMessage getGreeting(){
//        return new GreetingMessage("Hello welcome to SpringBoot");
//    }
//
    @GetMapping("/greet")
    public String getGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return greetingService.getGreetingMessage(firstName, lastName);
    }
}
