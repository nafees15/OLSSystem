package com.ols.dao;

import java.util.*;

import com.ols.po.*;

/**
 * @author adil alim
 *
 */

public interface QuestionDAO {
	public FillBlankQuestion getFillBlankQuestion(String QuestionID);
	public MultiChoiceQuestion getMultiChoiceQuestion(String QuestionID);
	public ArrayList<Question> getFillBlankQuestionList(String QuizID);
	public ArrayList<Question> getMultiChoiceQuestionList(String QuizID);	

	public String addFillBlankQuestion(Question question, String quizID);
	public String addMultiChoiceQuestion(Question question, String quizID);
	public void updateFillBlankQuestion(Question question);
	public void updateMultiChoiceQuestion(Question question);
	public void deleteFillBlankQuestion(String QuestionID);
	public void deleteMultiChoiceQuestion(String QuestionID);
}
