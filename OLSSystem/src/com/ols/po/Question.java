package com.ols.po;

import java.io.Serializable;

/**
 * @author adil alim
 *
 */
public class Question implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String QustionID;
	private int type; 
	public static final int MULTI_CHOICE_TYPE=1;
	public static final int FILL_BLANK_TYPE=2;
	
	public String getQustionID() {
		return QustionID;
	}
	public void setQustionID(String qustionID) {
		QustionID = qustionID;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
