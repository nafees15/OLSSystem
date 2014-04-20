package com.ols.service;

import java.util.ArrayList;

import com.ols.dao.*;
import com.ols.po.Quiz;

public class QuizServiceImpl implements QuizService{
	private QuizDAOImpl quizDAO=new QuizDAOImpl();
	
	@Override
	public ArrayList<Quiz> getQuizByCourseID(String CourseID) {
		// TODO Auto-generated method stub
		return quizDAO.getQuizByCourseID(CourseID);
	}

	@Override
	public void addNewQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		quizDAO.addQuiz(quiz);
	}

	@Override
	public void updateQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		quizDAO.updateQuiz(quiz);
	}

	@Override
	public void deleteQuiz(String QuizID) {
		// TODO Auto-generated method stub
		quizDAO.deleteQuiz(QuizID);
	}

}
