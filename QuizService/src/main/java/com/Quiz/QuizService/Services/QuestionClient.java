package com.Quiz.QuizService.Services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Quiz.QuizService.Entity.Question;

@FeignClient(url="http://localhost:8081",value="Question-Client")

//@FeignClient(name="QUESTIONSSERVICE")

public interface QuestionClient {
	
//	@GetMapping("/questionsByQuizId/{quizId}")
	@GetMapping("/Question/questionsByQuizId/{quizId}")
	List<Question> getQuestionOfQuiz(@PathVariable long quizId);

}


