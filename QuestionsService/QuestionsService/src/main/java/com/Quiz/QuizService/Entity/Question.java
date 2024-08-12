package com.Quiz.QuizService.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Question {
	
	private Long questionId;
	private String question;
	private Long quizId;
	
	
	public Question() {
		
	}
	
	
	
	public Question(Long questionId, String question, Long quizId) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.quizId = quizId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {

		this.question = question;
	}
	public Long getQuizId() {
		return quizId;
	}
	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", quizId=" + quizId + "]";
	}
	
	

}
