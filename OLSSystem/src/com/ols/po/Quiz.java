package com.ols.po;

import java.io.Serializable;

/**
 * @author adil alim
 *
 */

public class Quiz implements Serializable{
	
	
	

	
	public Quiz(){
		
	}
	public Quiz(String quizID, String quizName, String dueTime,
			float quizFullGrade, int totalQuestionNumber) {
		super();
		this.quizID = quizID;
		this.quizName = quizName;
		this.dueTime = dueTime;
		this.quizFullGrade = quizFullGrade;
		this.totalQuestionNumber = totalQuestionNumber;
	}


	
	private static final long serialVersionUID = 1L;
	
	private String quizID;
	private String quizName;
	private String dueTime;	
	private float quizFullGrade;
	private int totalQuestionNumber;
	
	/**
	 * @return the quizID
	 */
	public String getQuizID() {
		return quizID;
	}
	/**
	 * @param quizID the quizID to set
	 */
	public void setQuizID(String quizID) {
		this.quizID = quizID;
	}
	/**
	 * @return the quizName
	 */
	public String getQuizName() {
		return quizName;
	}
	/**
	 * @param quizName the quizName to set
	 */
	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}
	/**
	 * @return the dueTime
	 */
	public String getDueTime() {
		return dueTime;
	}
	/**
	 * @param dueTime the dueTime to set
	 */
	public void setDueTime(String dueTime) {
		this.dueTime = dueTime;
	}
	/**
	 * @return the quizFullGrade
	 */
	public float getQuizFullGrade() {
		return quizFullGrade;
	}
	/**
	 * @param quizFullGrade the quizFullGrade to set
	 */
	public void setQuizFullGrade(float quizFullGrade) {
		this.quizFullGrade = quizFullGrade;
	}
	/**
	 * @return the totalQuestionNumber
	 */
	public int getTotalQuestionNumber() {
		return totalQuestionNumber;
	}
	/**
	 * @param totalQuestionNumber the totalQuestionNumber to set
	 */
	public void setTotalQuestionNumber(int totalQuestionNumber) {
		this.totalQuestionNumber = totalQuestionNumber;
	}
	

	
	
}
