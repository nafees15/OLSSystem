package com.ols.po;

import java.io.Serializable;

/**
 * @author adil alim
 *
 */
public class Question implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String qustionID;
	private int type; 
	public static final int MULTI_CHOICE_TYPE=1;
	public static final int FILL_BLANK_TYPE=2;
	
	public String getQustionID() {
		return qustionID;
	}
	public void setQustionID(String qustionID) {
		this.qustionID = qustionID;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
