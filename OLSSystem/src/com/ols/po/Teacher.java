package com.ols.po;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author adil alim
 *
 */

public class Teacher implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private String TeacherID;
	private String Sex;
	private String FirstName;
	private String LastName;
	private Date DOB;
	private String Email;
	private String PhoneNumber;
	private String Password;
	
	
	public String getTeacherID() {
		return TeacherID;
	}
	public void setTeacherID(String teacherID) {
		TeacherID = teacherID;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		this.Sex = sex;
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
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dob) {
		DOB = dob;
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
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
