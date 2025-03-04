package com.example.SpringDevelopmentProject.SpringDevelopment.entitites;

import jakarta.persistence.*;

@Entity
@Table(name = "greetings")
public class GreetingMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}