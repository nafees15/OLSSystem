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
	private String Sex;
	private String FirstName;
	private String LastName;
	private Date DOB;
	private String Email;
	private String PhoneNumber;	
	private String Password;
	
	public Student(){
		
	}
	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getSex() {
		return Sex;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getEmail() {
		return Email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	
	/**
	 * @return the studentID
	 */
	public String getStudentID() {
		return StudentID;
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.Sex = sex;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	
	
	
}

