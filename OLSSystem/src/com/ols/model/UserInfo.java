package com.ols.model;

import java.io.Serializable;
import java.sql.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="User_Info")
public class UserInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public UserInfo(){
		
	}
	
	@Column(name="UserID")
	public long getUserID(){
		return UserID;
	}
	
	@Column(name="sex")
	public String getSex(){
		return sex;
	}
	
	@Column(name="FirstName")
	public String getFirstName(){
		return FirstName;
	}
	
	@Column(name="LastName")
	public String getLastName(){
		return LastName;
	}
	
	@Column(name="BOD")
	public Date getBOD(){
		return BOD;
	}
	
	@Column(name="Email")
	public String getEmail(){
		return Email;
	}
	
	@Column(name="PhoneNumber")
	public String getPhoneNumber(){
		return PhoneNumber;
	}
	
	public void setUserID(long UserID){
		this.UserID = UserID;
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
	
	private long UserID;
	private String sex;
	private String FirstName;
	private String LastName;
	private Date BOD;
	private String Email;
	private String PhoneNumber;

}
