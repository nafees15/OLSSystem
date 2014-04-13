package com.ols.po;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author adil alim
 *
 */

public class Student implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
	private String StudentID;
	private String sex;
	private String FirstName;
	private String LastName;
	private Date BOD;
	private String Email;
	private String PhoneNumber;
	private String Password;
	
	public Student(){
		
	}
	
	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

	
	public void setSex(String sex){
		this.sex = sex;
	}
	
	public void setFirstName(String FirstName){
		this.FirstName = FirstName;
	}
	
	public void setLastName(String LastName){
		this.LastName = LastName;
	}
	
	public void setBOD(Date BOD){
		this.BOD = BOD;
	}
	
	public void setEmail(String Email){
		this.Email = Email;
	}
	
	public void setPhoneNumber(String PhoneNumber){
		this.PhoneNumber = PhoneNumber;
	}
	
	

}

