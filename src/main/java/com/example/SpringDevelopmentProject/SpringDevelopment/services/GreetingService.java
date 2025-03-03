package com.example.SpringDevelopmentProject.SpringDevelopment.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreetingMessage(){
        return "hello World";
    }
}
