package com.Quiz.QuizService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Quiz.QuizService.Entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz,Long>{

}
