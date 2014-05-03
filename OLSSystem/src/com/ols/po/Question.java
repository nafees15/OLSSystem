package com.ols.po;

import java.io.Serializable;

/**
 * @author adil alim
 *
 */
public class Question implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String questionID;
	private int type; 
	public static final int MULTI_CHOICE_TYPE=1;
	public static final int FILL_BLANK_TYPE=2;
	
	public String getQuestionID() {
		return questionID;
	}
	public void setQuestionID(String questionID) {
		this.questionID = questionID;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
