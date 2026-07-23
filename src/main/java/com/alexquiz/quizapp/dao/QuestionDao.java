package com.alexquiz.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexquiz.quizapp.entities.Question;


//@Repository
public interface  QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);
    
}
