package com.ols.dao;

import java.util.*;

import com.ols.po.*;
/**
 * @author adil alim zeyang10
 *
 */

public interface QuizDAO {
	public Quiz getQuizByQuizID(String QuizID);
	public void addQuizToCourse(Quiz quiz,String CourseID);
	public ArrayList<Quiz> getQuizByCourseID(String CourseID);	
	public void addQuiz(Quiz quiz);
	public void updateQuiz(Quiz quiz);
	public void deleteQuiz(String QuizID);
	
}
