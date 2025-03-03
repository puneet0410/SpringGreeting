package com.example.SpringDevelopmentProject.SpringDevelopment.controllers;

import com.example.SpringDevelopmentProject.SpringDevelopment.dto.GreetingMessage;
import com.example.SpringDevelopmentProject.SpringDevelopment.services.GreetingService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/greeting")
public class HelloController {
    private final GreetingService greetingService;
    public HelloController(GreetingService greetingService){
        this.greetingService=greetingService;
    }
    @GetMapping
    public String getGreetings(){
        return greetingService.getGreetingMessage();
    }




//    @GetMapping
//    public GreetingMessage getGreeting(){
//        return new GreetingMessage("Hello welcome to SpringBoot");
//    }
    @PostMapping
    public GreetingMessage postGreeting(@RequestBody GreetingMessage greeting){
        return new GreetingMessage("hello "+greeting.getGreetMessage()+"! Your message is recieved");

    }
    @PutMapping
    public GreetingMessage upateGreeting(@RequestBody GreetingMessage greeting){
      return new GreetingMessage("Updated Greeting = "+greeting.getGreetMessage());
    }
    @DeleteMapping
    public GreetingMessage deleteGreeting(){
        return new GreetingMessage("Greeting message deleted successfully");
    }
}