package com.alexquiz.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexquiz.quizapp.entities.Question;
import com.alexquiz.quizapp.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {
    
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestion(){
        
        return questionService.getAllQuestions();
    }
}
