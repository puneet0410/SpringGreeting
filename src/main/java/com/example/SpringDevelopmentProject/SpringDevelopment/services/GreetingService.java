package com.example.SpringDevelopmentProject.SpringDevelopment.services;

import com.example.SpringDevelopmentProject.SpringDevelopment.dto.GreetingDTO;
import com.example.SpringDevelopmentProject.SpringDevelopment.entitites.GreetingMessage;
import com.example.SpringDevelopmentProject.SpringDevelopment.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public List<GreetingDTO> getAllGreetings() {
        return greetingRepository.findAll().stream()
                .map(g -> new GreetingDTO(g.getId(), g.getMessage()))
                .collect(Collectors.toList());
    }

    public GreetingDTO createGreeting(GreetingDTO greetingDTO) {
        GreetingMessage greeting = new GreetingMessage();
        greeting.setMessage(greetingDTO.getMessage());
        greeting = greetingRepository.save(greeting);
        return new GreetingDTO(greeting.getId(), greeting.getMessage());
    }
}