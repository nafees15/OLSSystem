package com.ols.po;

import java.util.ArrayList;


/**
 * @author adil alim
 *
 */

public class FillBlankQuestion extends Question {

	private static final long serialVersionUID = 1L;
	/*
	private String QuestionID;
	private String content;
	private ArrayList<String> option;
	private String correctAnswer;
	private int point;
	private String hints;*/
	
	private String questionID;
	private ArrayList<String> content;
	private ArrayList<String> option;
	private ArrayList<String> correctAnswer;
	private int point;
	private String hints;
	
	private final int type=FILL_BLANK_TYPE;

	public void FillBlankQuestion(){
		
	}
	
	public String getQuestionID() {
		return questionID;
	}
	public void setQuestionID(String questionID) {
		this.questionID = questionID;
	}
	public ArrayList<String> getContent() {
		return content;
	}
	public void setContent(ArrayList<String> content) {
		this.content = content;
	}
	public ArrayList<String> getOption() {
		return option;
	}
	public void setOption(ArrayList<String> option) {
		this.option = option;
	}
	
	public String getHints() {
		return hints;
	}
	public void setHints(String hints) {
		this.hints = hints;
	}
	
	public int getType() {
		return type;
	}
	public ArrayList<String> getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(ArrayList<String> correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
