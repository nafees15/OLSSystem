package com.ols.service;

import java.util.ArrayList;

import com.ols.po.*;

/**
 * @author adil alim
 *
 */

public interface QuizService {
	
public ArrayList<Quiz> getQuizByCourseID(String CourseID);
public void addNewQuiz(Quiz quiz);
public void updateQuiz(Quiz quiz);
public void deleteQuiz(String QuizID);

}
