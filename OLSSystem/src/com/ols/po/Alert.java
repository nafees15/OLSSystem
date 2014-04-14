package com.ols.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author adil alim
 *
 */

public class Alert implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	/*Alert Level*/
	public final int NOTIFICATION=3;
	public final int MINOR_ALERT=2;
	public final int MAJOR_ALERT=1; 
	
	private String AlertID;
	private Date AlerTime;
	private int Level;
	
	public String getAlertID() {
		return AlertID;
	}
	public void setAlertID(String alertID) {
		AlertID = alertID;
	}
	public Date getAlerTime() {
		return AlerTime;
	}
	public void setAlerTime(Date alerTime) {
		AlerTime = alerTime;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	
	
}
