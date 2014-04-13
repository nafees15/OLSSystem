package com.ols.po;

import java.util.List;

/**
 * @author adil alim
 *
 */

public class FillBlankQuestion extends Question {

	private static final long serialVersionUID = 1L;
	
	private String QuestionID;
	private List<String> content;
	private List<String> option;
	private List<Integer> correct;
	private String hints;
	
	private final int type=FILL_BLANK_TYPE;

	
	
	public String getQuestionID() {
		return QuestionID;
	}
	public void setQuestionID(String questionID) {
		QuestionID = questionID;
	}
	public List<String> getContent() {
		return content;
	}
	public void setContent(List<String> content) {
		this.content = content;
	}
	public List<String> getOption() {
		return option;
	}
	public void setOption(List<String> option) {
		this.option = option;
	}
	public List<Integer> getCorrect() {
		return correct;
	}
	public void setCorrect(List<Integer> correct) {
		this.correct = correct;
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
}
