package com.ols.service;

import java.util.ArrayList;

import com.ols.po.*;

/**
 * @author adil alim
 *
 */

public interface QuizService {
	
public ArrayList<Quiz> getQuizByCourseID(String CourseID);
public Quiz getQuiz(String QuizID);
public void addQuizToCourse(Quiz quiz,String CourseID);
public void addNewQuiz(Quiz quiz);
public void updateQuiz(Quiz quiz);
public void deleteQuiz(String QuizID);

}
