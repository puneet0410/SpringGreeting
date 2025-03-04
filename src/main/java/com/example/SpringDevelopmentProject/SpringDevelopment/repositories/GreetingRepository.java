package com.example.SpringDevelopmentProject.SpringDevelopment.repositories;

import com.example.SpringDevelopmentProject.SpringDevelopment.entitites.GreetingMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingMessage, Long> {
}
