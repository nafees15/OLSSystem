package com.ols.po;

import java.util.List;

/**
 * @author adil alim
 *
 */

public class MultiChoiceQuestion extends Question {

	private static final long serialVersionUID = 1L;
	
	private String QuestionID;
	private String content;
	private List<String> option;
	private String correctAnswer;
	private int point;
	private String hints;
	
	private final int type=MULTI_CHOICE_TYPE;
	
	
	public int getType() {
		return type;
	}
	public String getQuestionID() {
		return QuestionID;
	}
	public void setQuestionID(String questionID) {
		QuestionID = questionID;
	}
	public String getQuestionContent() {
		return content;
	}
	public void setQuestionContent(String questionContent) {
		content = questionContent;
	}
	public List<String> getMcOptions() {
		return option;
	}
	public void setMcOptions(List<String> mcOptions) {
		this.option = mcOptions;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getHints() {
		return hints;
	}
	public void setHints(String hints) {
		this.hints = hints;
	}
	
	
}
