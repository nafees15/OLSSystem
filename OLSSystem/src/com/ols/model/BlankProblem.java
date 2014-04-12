package com.ols.model;

import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="blank_problem")
public class BlankProblem implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public BlankProblem(){
		
	}
	
	@Column(name="BlankID")
	public long getBlankID(){
		return BlankID;
	}
	
	@Column(name="QuizID")
	public long getQuizID(){
		return QuizID;
	}
	
	@Column(name="Subject_1")
	public String getSubject_1(){
		return Subject_1;
	}
	
	@Column(name="Subject_2")
	public String getSubject_2(){
		return Subject_2;
	}
	
	@Column(name="Subject_3")
	public String getSubject_3(){
		return Subject_3;
	}
	
	@Column(name="Options_1")
	public String getOptions_1(){
		return Options_1;
	}
	
	@Column(name="Options_2")
	public String getOptions_2(){
		return Options_2;
	}
	
	@Column(name="Options_3")
	public String getOptions_3(){
		return Options_3;
	}
	
	@Column(name="CorrectAns_1")
	public String getCorrectAns_1(){
		return CorrectAns_1;
	}
	
	@Column(name="CorrectAns_2")
	public String getCorrectAns_2(){
		return CorrectAns_2;
	}
	
	@Column(name="CorrectAns_3")
	public String getCorrectAns_3(){
		return CorrectAns_3;
	}
	
	public void setBlankID(long BlankID){
		this.BlankID = BlankID;
	}
	
	public void setQuizID(long QuizID){
		this.QuizID = QuizID;
	}
	
	public void setSubject_1(String Subject_1){
		this.Subject_1 = Subject_1;
	}
	
	public void setSubject_2(String Subject_2){
		this.Subject_2 = Subject_2;
	}
	
	public void setSubject_3(String Subject_3){
		this.Subject_3 = Subject_3;
	}
	
	public void setOptions_1(String Options_1){
		this.Options_1 = Options_1;
	}
	
	public void setOptions_2(String Options_2){
		this.Options_2 = Options_2;
	}
	
	public void setOptions_3(String Options_3){
		this.Options_3 = Options_3;
	}
	
	public void setCorrectAns_1(String CorrectAns_1){
		this.CorrectAns_1 = CorrectAns_1;
	}
	
	public void setCorrectAns_2(String CorrectAns_2){
		this.CorrectAns_2 = CorrectAns_2;
	}
	
	public void setCorrectAns_3(String CorrectAns_3){
		this.CorrectAns_3 = CorrectAns_3;
	}
	
	private long BlankID;
	private long QuizID;
	private String Subject_1;
	private String Subject_2;
	private String Subject_3;
	private String Options_1;
	private String Options_2;
	private String Options_3;
	private String CorrectAns_1;
	private String CorrectAns_2;
	private String CorrectAns_3;

}
