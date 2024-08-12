package com.Quiz.QuizService.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Quiz {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String title;
	
    transient private List<Question> questions;
	//using transient it  is not store in database
	
//	public 	Quiz() {
//
//	}
//
//	public void setQuestions(List<Question> questions) {
//		System.out.println("questions from setter "+questions);
//		this.questions = questions;
//	}

//	public Quiz(Long id, String title) {
//		super();
//		this.id = id;
//		this.title = title;
//	}


//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	@Override
//	public String toString() {
//		return "Quiz [id=" + id + ", title=" + title + "]";
//	}
}
