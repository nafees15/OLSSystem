package com.ols.dao;

import java.util.List;

import com.ols.po.*;


public interface QuestionDAO {
	public Question getQuestion(String QuestionID);
	
	public void addQuestion(Question question);
	public void updateQuestion(Question question);
	public void deleteQuestion(String QuestionID);
}
