package com.example.SpringDevelopmentProject.SpringDevelopment.controllers;

import com.example.SpringDevelopmentProject.SpringDevelopment.dto.GreetingDTO;
import com.example.SpringDevelopmentProject.SpringDevelopment.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/greetings")
public class HelloController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public List<GreetingDTO> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    @PostMapping
    public GreetingDTO createGreeting(@RequestBody GreetingDTO greetingDTO) {
        return greetingService.createGreeting(greetingDTO);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}

