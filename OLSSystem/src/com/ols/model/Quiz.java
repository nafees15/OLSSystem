package com.ols.model;

import java.io.Serializable;
import java.sql.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="quiz")
public class Quiz implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public Quiz(){
		
	}
	
	@Column(name="quizID")
	public long getQuizID(){
		return QuizID;
	}
	
	@Column(name="ShowUpTime")
	public Date getShowUpTime(){
		return ShowUpTime;
	}
	
	@Column(name="ChapterID")
	public long getChapterID(){
		return ChapterID;
	}
	
	public void setQuizID(long QuizID){
		this.QuizID = QuizID;
	}
	
	public void setShowUpTime(Date ShowUpTime){
		this.ShowUpTime = ShowUpTime;
	}
	
	public void setChapterID(long ChapterID){
		this.ChapterID = ChapterID;
	}
	
	private long QuizID;
	private Date ShowUpTime;
	private long ChapterID;

}
