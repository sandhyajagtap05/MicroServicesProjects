package com.Quiz.QuizService.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Quiz.QuizService.Entity.Quiz;
import com.Quiz.QuizService.Repositories.QuizRepository;

@Service
public class QuizServiceImpl implements QuizServices{

	@Autowired 
	private QuizRepository quizRepository;
	
	
	@Autowired
	private QuestionClient questionClient;
	

	public QuizServiceImpl(QuizRepository quizRepository) {
		super();
		this.quizRepository = quizRepository;
	}

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRepository.save(quiz);
	}
//
//	@Override
//	public List<Quiz> get() {
//		// TODO Auto-generated method stub
//		return quizRepository.findAll();
//	}
	
	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		System.out.println("Get all called");
		List<Quiz> quizes=quizRepository.findAll();
		System.out.println("quizes"+quizes);
		List<Quiz> newQuizList=quizes.stream().map(quiz->{
			quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
			System.out.println("quiz"+quiz);
			return quiz;
		}).collect(Collectors.toList());
		System.out.println("newQuizList"+newQuizList);
		return newQuizList;
	}
	
	
//	@Override
//	public Quiz get(Long id) {
//		// TODO Auto-generated method stub
//		return quizRepository.findById(id).orElseThrow(()->new RuntimeException("quiz not found"));
//	}
	
	
	@Override
	public Quiz get(Long id) {


		System.out.println("Get one called");

		Quiz quiz=quizRepository.findById(id).orElseThrow(()->new RuntimeException("quiz not found"));
		
		quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));

		return quiz;
	}

}
