package com.Quiz.QuizService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Quiz.QuizService.Entity.Quiz;
import com.Quiz.QuizService.Services.QuizServices;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizServices quizServices;
	
	public QuizController(QuizServices quizServices) {
		super();
		this.quizServices = quizServices;
	}

	@PostMapping("/add")
	public Quiz create(@RequestBody Quiz quiz) {
		return quizServices.add(quiz);
	}
	
	@GetMapping("/get")
	public List<Quiz> getQuiz(){
		System.out.println("get method called");
		return quizServices.get();
	}

	@GetMapping("/get/{id}")
	public Quiz getOne(@PathVariable Long id){
		return quizServices.get(id);
		
	}
}
