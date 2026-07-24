package com.alexquiz.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexquiz.quizapp.entities.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
    
}
