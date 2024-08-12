package com.Quiz.QuizService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.Quiz.QuizService.Entity.Quiz;

@SpringBootApplication
@EnableFeignClients
public class QuizServiceApplication {

	public static void main(String[] args) {
		
//		   Quiz quiz = new Quiz();
//	        quiz.setTitle("Lombok Test");
//	        System.out.println("Quiz Title: " + quiz.getTitle());
		
		System.out.println("quiz client");
		SpringApplication.run(QuizServiceApplication.class, args);
	}

}
