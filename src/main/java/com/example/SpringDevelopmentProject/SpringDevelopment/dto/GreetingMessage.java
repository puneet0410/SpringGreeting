package com.example.SpringDevelopmentProject.SpringDevelopment.dto;

import java.sql.SQLOutput;

public class GreetingMessage {
    private String greetMessage;
public GreetingMessage(String greetMessage){
    this.greetMessage=greetMessage;
}
public GreetingMessage(){

}
public String getGreetMessage(){
//    System.out.println("starting message");
    return greetMessage;
}
public void Setmessage(String greetMessage){
    this.greetMessage=greetMessage;
}
}
