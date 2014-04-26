package com.ols.service;

import java.util.ArrayList;




import com.ols.po.*;

public interface QuestionService {
	public 	ArrayList<Question> getQuestionListByQuizID(String QuizID);
	public 	ArrayList<QuestionTable> getQuestionTable(ArrayList<Question> allQuestionList);//
	

	
	public FillBlankQuestion getFillBlankQuestion(String QuestionID);
	public MultiChoiceQuestion getMultiChoiceQuestion(String QuestionID);
	public ArrayList<Question> getFillBlankQuestionList(String QuizID);
	public ArrayList<Question> getMultiChoiceQuestionList(String QuizID);	
	public void addNewFillBlankQuestion(Question question);
	public void addNewMultiChoiceQuestion(Question question);
	public void updateFillBlankQuestion(Question question);
	public void updateMultiChoiceQuestion(Question question);
	public void deleteFillBlankQuestion(String QuestionID);
	public void deleteMultiChoiceQuestion(String QuestionID);
}
