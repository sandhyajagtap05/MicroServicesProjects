package com.Quiz.QuizService.Services;

import java.util.List;

import com.Quiz.QuizService.Entity.Quiz;

public interface QuizServices {
	
	Quiz add(Quiz quiz);
	
	List<Quiz> get();
	
	Quiz get(Long id);

}
