package com.ols.model;

import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public Login()
	{
		
	}
	
	@Column(name="UserID")
	public long getUserID(){
		return UserID;
	}
	
	public void setUserID(long UserID){
		this.UserID = UserID;
	}
	
	@Column(name="PassWord")
	public String getPassWord(){
		return PassWord;
	}
	
	public void setPassWord(String PassWord){
		this.PassWord = PassWord;
	}
	
	private long UserID;
	private String PassWord;

}
