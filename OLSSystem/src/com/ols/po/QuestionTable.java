package com.ols.po;

import java.io.Serializable;

public class QuestionTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String questionID;	
	private String content;
	private String correctAnswer;
	
	public QuestionTable(){
		
	}
	public QuestionTable(String questionID, String content, String correctAnswer) {
		super();
		this.questionID = questionID;
		this.content = content;
		this.correctAnswer = correctAnswer;
	}
	/**
	 * @return the questionID
	 */
	public String getQuestionID() {
		return questionID;
	}
	/**
	 * @param questionID the questionID to set
	 */
	public void setQuestionID(String questionID) {
		System.out.println("Set QuestionID="+questionID);
		this.questionID = questionID;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the correctAnswer
	 */
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	/**
	 * @param correctAnswer the correctAnswer to set
	 */
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
}
