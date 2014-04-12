package com.ols.po;

import java.io.Serializable;
import java.sql.Date;

public class Teacher implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private String TeacherID;
	private String sex;
	private String FirstName;
	private String LastName;
	private Date BOD;
	private String Email;
	private String PhoneNumber;
	
	
	public String getTeacherID() {
		return TeacherID;
	}
	public void setTeacherID(String teacherID) {
		TeacherID = teacherID;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getBOD() {
		return BOD;
	}
	public void setBOD(Date bOD) {
		BOD = bOD;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
}
