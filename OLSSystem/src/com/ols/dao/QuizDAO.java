package com.ols.dao;

import java.util.ArrayList;
import java.util.*;

import com.ols.po.*;
/**
 * @author adil alim
 *
 */

public interface QuizDAO {
	
	public ArrayList<Quiz> getQuizByCourseID(String CourseID);	
	public void addQuiz(Quiz quiz);
	public void updateQuiz(Quiz Quiz);
	public void deleteQuiz(String QuizID);
	
}
