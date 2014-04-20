package com.ols.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ols.database.DBConnection;
import com.ols.po.Course;
import com.ols.po.Quiz;

public class QuizDAOImpl implements QuizDAO{
	private static Connection connection;
	private static DBConnection dbc;
	private static PreparedStatement pstat;
	
	@Override
	public ArrayList<Quiz> getQuizByCourseID(String CourseID) {	
		ArrayList<Quiz> quizList = new ArrayList<Quiz>();
		String sql = "SELECT * from vi_quiz_quizlist where CourseID=?";
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, CourseID);
			ResultSet urs = (ResultSet) pstat.executeQuery();
			while (urs.next()) {
				Quiz quiz = new Quiz();
				quiz.setQuizID(urs.getString(1));
				quiz.setQuizName(urs.getString(2));
				quiz.setDueTime(urs.getString(3));
				quiz.setQuizFullGrade(urs.getFloat(4));
				quiz.setTotalQuestionNumber(urs.getInt(5));
				quizList.add(quiz);
			}
			urs.close();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return quizList;
	}

	@Override
	public void addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		/*private String QuizID;1
		private String QuizName;2
		private String DueTime;	3
		private float QuizFullGrade;4
		private int TotalQuestionNumber;5
		*/
		
		String sql = "insert into quiz values(?,?,?,?,?)";
		try {
			
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, quiz.getQuizID());
			pstat.setString(2, quiz.getQuizName());
			pstat.setString(3, quiz.getDueTime());
			pstat.setFloat(4, quiz.getQuizFullGrade());
			pstat.setInt(5, quiz.getTotalQuestionNumber());
			
			pstat.executeUpdate();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		String sql = "update quiz set quizName=?, DueTime=?,QuizFullGrade=?,TotalQuestionNumber=? where quizID=?";
		try {
			
			pstat = connection.prepareStatement(sql);
			pstat.setString(5, quiz.getQuizID());
			pstat.setString(1, quiz.getQuizName());
			pstat.setString(2, quiz.getDueTime());
			pstat.setFloat(3, quiz.getQuizFullGrade());
			pstat.setInt(4, quiz.getTotalQuestionNumber());

			pstat.executeUpdate();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteQuiz(String QuizID) {
		// TODO Auto-generated method stub
		String sql = "delete from quiz where quizID=?";
		try {		
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, QuizID);

			pstat.executeUpdate();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Quiz getQuizByQuizID(String QuizID) {
		// TODO Auto-generated method stub
		/*private String QuizID;
		private String QuizName;
		private String DueTime;	
		private float QuizFullGrade;
		private int TotalQuestionNumber;*/
		String sql = "select * from quiz where quizID=?";
		Quiz quiz = new Quiz();
		try {		
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, QuizID);
			ResultSet urs = (ResultSet) pstat.executeQuery();		
			if (urs.next()) {
				quiz.setQuizID(urs.getString(1));
				quiz.setQuizName(urs.getString(2));
				quiz.setDueTime(urs.getString(3));
				quiz.setQuizFullGrade(urs.getFloat(4));
				quiz.setTotalQuestionNumber(urs.getInt(5));
				
			}	
			urs.close();
			pstat.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return quiz;
	}

}
