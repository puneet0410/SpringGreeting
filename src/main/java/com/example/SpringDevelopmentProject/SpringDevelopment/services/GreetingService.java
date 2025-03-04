package com.example.SpringDevelopmentProject.SpringDevelopment.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreetingMessage(String firstName,String lastName){
        if(firstName!=null && lastName!=null){
            return "Hello "+firstName+" "+lastName;
        } else if (firstName!=null) {
            return "hello "+firstName;
        } else if (lastName!=null) {
            return "hello "+lastName;
        }else{
            return "hello world";
        }
    }
}
