package com.ols.model;

import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="choice_problem")
public class ChoiceProblem implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public ChoiceProblem(){
		
	}
	
	@Column(name="ChoiceID")
	public long setChoiceID(){
		return ChoiceID;
	}
	
	@Column(name="QuizID")
	public long setQuizID(){
		return QuizID;
	}
	
	@Column(name="Subject")
	public String setSubject(){
		return Subject;
	}
	
	@Column(name="Options")
	public String setOptions(){
		return Options;
	}
	
	@Column(name="CorrectAnswer")
	public String setCorrectAnswer(){
		return CorrectAnswer;
	}
	
	public void setChoiceID(long ChoiceID){
		this.ChoiceID = ChoiceID;
	}
	
	public void setQuizID(long QuizID){
		this.QuizID = QuizID;
	}
	
	public void setSubject(String Subject){
		this.Subject = Subject;
	}
	
	public void setOptions(String Options){
		this.Options = Options;
	}
	
	public void setCorrectAnswer(String CorrectAnswer){
		this.CorrectAnswer = CorrectAnswer;
	}
	
	private long ChoiceID;
	private long QuizID;
	private String Subject;
	private String Options;
	private String CorrectAnswer;
}
