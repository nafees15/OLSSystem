package com.ols.dao;

import java.util.List;

import com.ols.po.*;
/**
 * @author adil alim
 *
 */

public interface QuizDAO {
	public List<Question> getQuestionByQuizID(String QuizID);
	public void addQuiz(Quiz quiz);
	public void updateQuiz(Quiz Quiz);
	public void deleteQuiz(String QuizID);
	
}
