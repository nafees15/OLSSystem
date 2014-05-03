package com.ols.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.ols.po.*;

/**
 * @author adil alim
 *
 */

public interface QuizService {
public void calculateGrades(HashMap<String, String> submitAnswer, String studentID, String quizID);	
	
public ArrayList<Quiz> getQuizByCourseID(String CourseID);
public Quiz getQuiz(String QuizID);
public void addNewQuiz(Quiz quiz,String CourseID);
public void updateQuiz(Quiz quiz);
public void deleteQuiz(String QuizID);

}
