package com.example.SpringDevelopmentProject.SpringDevelopment.dto;

public class GreetingMessage {
    private String greetMessage;
public GreetingMessage(String greetMessage){
    this.greetMessage=greetMessage;
}
public GreetingMessage(){

}
public String getGreetMessage(){
    return greetMessage;
}
public void Setmessage(String greetMessage){
    this.greetMessage=greetMessage;
}
}
