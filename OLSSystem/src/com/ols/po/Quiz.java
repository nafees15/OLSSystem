package com.ols.po;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author adil alim
 *
 */

public class Quiz implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	
	private String QuizID;
	private String QuizName;
	private Date DueTime;	
	private float QuizFullGrade;
	private int TotalQuestionNumber;
	
	public Quiz(){
		
	}
	public Quiz(String quizID, String quizName, Date dueTime,
			float quizFullGrade, int totalQuestionNumber) {
		super();
		QuizID = quizID;
		QuizName = quizName;
		DueTime = dueTime;
		QuizFullGrade = quizFullGrade;
		TotalQuestionNumber = totalQuestionNumber;
	}
	
	public String getQuizID() {
		return QuizID;
	}
	public void setQuizID(String quizID) {
		QuizID = quizID;
	}
	public String getQuizName() {
		return QuizName;
	}
	public void setQuizName(String quizName) {
		QuizName = quizName;
	}
	public Date getDueTime() {
		return DueTime;
	}
	public void setDueTime(Date dueTime) {
		DueTime = dueTime;
	}
	public float getQuizFullGrade() {
		return QuizFullGrade;
	}
	public void setQuizFullGrade(float quizFullGrade) {
		QuizFullGrade = quizFullGrade;
	}
	public int getTotalQuestionNumber() {
		return TotalQuestionNumber;
	}
	public void setTotalQuestionNumber(int totalQuestionNumber) {
		TotalQuestionNumber = totalQuestionNumber;
	}
	
	
}
