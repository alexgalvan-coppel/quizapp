package com.alexquiz.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.alexquiz.quizapp.entities.Question;


//@Repository
public interface  QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "SELECT q.id FROM question q Where q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
    
}
