package com.ols.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.ols.dao.*;
import com.ols.po.Quiz;

public class QuizServiceImpl implements QuizService{
	private QuizDAOImpl quizDAO=new QuizDAOImpl();
	
	public void calculateGrades(HashMap<String, String> submitAnswer, String studentID, String quizID) {
		quizDAO.calculateGrades(submitAnswer, studentID, quizID);
	}
	@Override
	public ArrayList<Quiz> getQuizByCourseID(String CourseID) {
		// TODO Auto-generated method stub
		return quizDAO.getQuizByCourseID(CourseID);
	}

	
	
	@Override
	public void addNewQuiz(Quiz quiz, String CourseID) {
		// TODO Auto-generated method stub
		quizDAO.addQuiz(quiz);
		quizDAO.addQuizToCourse(quiz, CourseID);
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

	@Override
	public Quiz getQuiz(String QuizID) {
		// TODO Auto-generated method stub
		
		return quizDAO.getQuizByQuizID(QuizID);
	}

}
