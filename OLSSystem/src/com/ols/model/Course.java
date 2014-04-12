package com.ols.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public Course(long courseID, int credit, String state, String description){
		this.courseID = courseID;
		this.credit = credit;
		this.state = state;
		this.description = description;
	}
	
	@Column(name="CourseID")
	public long getCourseID(){
		return courseID;
	}
	
	@Column(name="credit")
	public int getCredit(){
		return credit;
	}
	
	@Column(name="state")
	public String getState(){
		return state;
	}
	
	@Column(name="description")
	public String getDescription(){
		return description;
	}
	
	public void setCourseID(long courseID){
		this.courseID = courseID;
	}
	
	public void setCredit(int credit){
		this.credit = credit;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	
	private long courseID;
	private int credit;
	private String state;
	private String description;
	
	
	
}
