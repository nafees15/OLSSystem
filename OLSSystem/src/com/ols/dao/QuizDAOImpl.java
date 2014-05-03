package com.ols.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.ols.database.DBConnection;
import com.ols.po.Course;
import com.ols.po.FillBlankQuestion;
import com.ols.po.MultiChoiceQuestion;
import com.ols.po.Question;
import com.ols.po.Quiz;
import com.ols.service.*;
import com.ols.util.CorrectAnswerUtil;

public class QuizDAOImpl implements QuizDAO{
	private static Connection connection;
	private static DBConnection dbc;
	private static PreparedStatement pstat;
	
	public void calculateGrades(HashMap<String, String> submitAnswer, String studentID, String quizID) {
		dbc = new DBConnection();
		connection = dbc.getConnection();
		//System.out.println(quizID);
		QuestionServiceImpl questionService = new QuestionServiceImpl();	
		ArrayList<Question> list =new ArrayList<Question>();
		list=(ArrayList<Question>)questionService.getQuestionListByQuizID(quizID);
		System.out.println(list.size());
		for(Question question : list) {
			System.out.println("list qid-"+question.getQuestionID()+question.getType());
			}
		String sql = "insert into answerrecord values(?,?,?,?)";
		try {	
			ArrayList<Map.Entry<String, String>> listAnswer = new ArrayList<Map.Entry<String, String>>(submitAnswer.entrySet());	
			pstat = connection.prepareStatement(sql);//
	        for (Map.Entry<String, String> entry : listAnswer) {
	            pstat.setString(1, entry.getKey());
				pstat.setString(2, studentID);
				pstat.setString(3, entry.getValue());
				pstat.setString(4, quizID);
				pstat.executeUpdate();
	        }
	        int sumPoint = 0;
			for(Question question : list) {
				System.out.println("qid-"+question.getQuestionID());
				String questionID = question.getQuestionID();
				int point = 0;
				String stuAnswer = (String)submitAnswer.get(questionID);
				String correctAnswer = "";
				if(question.getType() == Question.MULTI_CHOICE_TYPE) {
					MultiChoiceQuestion multiChoiceQuestion = (MultiChoiceQuestion) question;
					point = multiChoiceQuestion.getPoint();
					correctAnswer = multiChoiceQuestion.getCorrectAnswer();
				}
				if(question.getType() == Question.FILL_BLANK_TYPE) {
					FillBlankQuestion fillBlankQuestion = (FillBlankQuestion) question;	
					point = fillBlankQuestion.getPoint();
					correctAnswer = CorrectAnswerUtil.correctAnswerMerge( fillBlankQuestion.getCorrectAnswer() );
				}
				System.out.println(stuAnswer+"QuizDAO"+correctAnswer);
				if(stuAnswer.equals(correctAnswer)) sumPoint += point;	
			}
			sql = "insert into grade values(?,?,?)";
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, quizID);
			pstat.setString(2, studentID);
			pstat.setInt(3, sumPoint);
			pstat.executeUpdate();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public ArrayList<Quiz> getQuizByCourseID(String CourseID) {	
		dbc = new DBConnection();
		connection = dbc.getConnection();
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

	public void addQuizToCourse(Quiz quiz,String CourseID) {
		dbc = new DBConnection();
		connection = dbc.getConnection();
		String sql = "insert into quizlist values(?,?)";
		try {
			
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, CourseID);
			pstat.setString(2, quiz.getQuizID());
			
	
			pstat.executeUpdate();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		dbc = new DBConnection();
		connection = dbc.getConnection();
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
		dbc = new DBConnection();
		connection = dbc.getConnection();
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
		dbc = new DBConnection();
		connection = dbc.getConnection();
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
		dbc = new DBConnection();
		connection = dbc.getConnection();
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
