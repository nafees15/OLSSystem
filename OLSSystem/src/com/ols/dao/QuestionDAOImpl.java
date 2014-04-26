package com.ols.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ols.database.DBConnection;
import com.ols.po.*;
import com.ols.util.*;

public class QuestionDAOImpl implements QuestionDAO {
	private static Connection connection;
	private static DBConnection dbc;
	private static PreparedStatement pstat;
	
	@Override
	public FillBlankQuestion getFillBlankQuestion(String QuestionID) {
		// TODO Auto-generated method stub
		/*private String QuestionID;1
		private List<String> content;2
		private List<String> option;3
		private List<String> correctAnswer;4
		private int point;5
		private String hints;6
		*/
		FillBlankQuestion fillBlankQuestion = new FillBlankQuestion();
		dbc = new DBConnection();
		connection = dbc.getConnection();
		String sql = "SELECT * from fillblankquestion where QuestionID=?";
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, QuestionID);
			ResultSet urs = (ResultSet) pstat.executeQuery();
			if (urs.next()) {
				fillBlankQuestion.setQuestionID(urs.getString(1));
				fillBlankQuestion.setContent(ContentUtil.contentSplit(urs.getString(2)));
				fillBlankQuestion.setOption(OptionUtil.optionSplit(urs.getString(3)));
				fillBlankQuestion.setCorrectAnswer(CorrectAnswerUtil.correctAnswerSplit(urs.getString(4)));
				fillBlankQuestion.setPoint(urs.getInt(5));
				fillBlankQuestion.setHints(urs.getString(6));
				
				urs.close();
				pstat.close();
				connection.close();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fillBlankQuestion;
		
	}

	@Override
	public MultiChoiceQuestion getMultiChoiceQuestion(String QuestionID) {
		// TODO Auto-generated method stub
		MultiChoiceQuestion multiChoiceQuestion = new MultiChoiceQuestion();
		dbc = new DBConnection();
		connection = dbc.getConnection();
		String sql = "SELECT * from multichoicequestion where QuestionID=?";
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, QuestionID);
			ResultSet urs = (ResultSet) pstat.executeQuery();
			if (urs.next()) {
				multiChoiceQuestion.setQuestionID(urs.getString(1));
				multiChoiceQuestion.setQuestionContent(urs.getString(2));
				multiChoiceQuestion.setMcOptions(OptionUtil.optionSplit(urs.getString(3)));
				multiChoiceQuestion.setCorrectAnswer(urs.getString(4));
				multiChoiceQuestion.setPoint(urs.getInt(5));
				multiChoiceQuestion.setHints(urs.getString(6));
				
				urs.close();
				pstat.close();
				connection.close();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return multiChoiceQuestion;
	}

	@Override
	public ArrayList<Question> getFillBlankQuestionList(String QuizID) {
		// TODO Auto-generated method stub
		/*private String QuestionID;
		private ArrayList<String> content;
		private ArrayList<String> option;
		private ArrayList<String> correctAnswer;
		private int point;
		private String hints;*/
		dbc = new DBConnection();
		connection = dbc.getConnection();
		ArrayList<Question> questionList = new ArrayList<Question>();
		String sql = "SELECT * from vi_fillblankquestion_questionlist where QuizID=?";
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, QuizID);
			ResultSet urs = (ResultSet) pstat.executeQuery();
			while (urs.next()) {
				FillBlankQuestion fillBlankQuestion = new FillBlankQuestion();
				fillBlankQuestion.setQuestionID(urs.getString(1));
				fillBlankQuestion.setContent(ContentUtil.contentSplit(urs.getString(2)));
				fillBlankQuestion.setOption(ContentUtil.contentSplit(urs.getString(3)));
				fillBlankQuestion.setCorrectAnswer(ContentUtil.contentSplit(urs.getString(4)));
				fillBlankQuestion.setPoint(urs.getInt(5));
				fillBlankQuestion.setHints(urs.getString(6));

				questionList.add(fillBlankQuestion);
			}
			urs.close();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return questionList;
	}

	@Override
	public ArrayList<Question> getMultiChoiceQuestionList(String QuizID) {
		// TODO Auto-generated method stub
		/*private String QuestionID;
	private String content;
	private ArrayList<String> option;
	private String correctAnswer;
	private int point;
	private String hints;*/
		dbc = new DBConnection();
		connection = dbc.getConnection();
		ArrayList<Question> questionList = new ArrayList<Question>();
		String sql = "SELECT * from vi_multichoicequestion_questionlist where QuizID=?";
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, QuizID);
			ResultSet urs = (ResultSet) pstat.executeQuery();
			while (urs.next()) {
				MultiChoiceQuestion multiChoiceQuestion = new MultiChoiceQuestion();
				multiChoiceQuestion.setQuestionID(urs.getString(1));
				multiChoiceQuestion.setQuestionContent(urs.getString(2));
				multiChoiceQuestion.setMcOptions(OptionUtil.optionSplit(urs.getString(3)));
				multiChoiceQuestion.setCorrectAnswer(urs.getString(4));
				multiChoiceQuestion.setPoint(urs.getInt(5));
				multiChoiceQuestion.setHints(urs.getString(6));

				questionList.add(multiChoiceQuestion);
			}
			urs.close();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return questionList;
	}

	@Override
	public void addFillBlankQuestion(Question question) {
		// TODO Auto-generated method stub
		/*private String QuestionID;1
		private List<String> content;2
		private List<String> option;3
		private List<String> correctAnswer;4
		private int point;5
		private String hints;6
		*/
		FillBlankQuestion fillBlankQuestion =(FillBlankQuestion) question;
		dbc = new DBConnection();
		connection = dbc.getConnection();
		String sql = "insert into fillblankquestion values(?,?,?,?,?,?)";
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, fillBlankQuestion.getQustionID());
			pstat.setString(2, ContentUtil.contentMerge(fillBlankQuestion.getContent()));
			pstat.setString(3, OptionUtil.optionMerge(fillBlankQuestion.getOption()));
			pstat.setString(4, CorrectAnswerUtil.correctAnswerMerge(fillBlankQuestion.getCorrectAnswer()));
			pstat.setInt(5, fillBlankQuestion.getPoint());
			pstat.setString(6, fillBlankQuestion.getHints());
			pstat.executeUpdate();
			
				pstat.close();
				connection.close();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void addMultiChoiceQuestion(Question question) {
		// TODO Auto-generated method stub
		/*		
		private String QuestionID;1
	private String content;2
	private List<String> option;3
	private String correctAnswer;4
	private int point;5
	private String hints;6
		*/
		MultiChoiceQuestion multiChoiceQuestion =(MultiChoiceQuestion) question;
		dbc = new DBConnection();
		connection = dbc.getConnection();
		String sql = "insert into fillblankquestion values(?,?,?,?,?,?)";
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, multiChoiceQuestion.getQustionID());
			pstat.setString(2, multiChoiceQuestion.getQuestionContent());
			pstat.setString(3, OptionUtil.optionMerge(multiChoiceQuestion.getMcOptions()));
			pstat.setString(4, multiChoiceQuestion.getCorrectAnswer());
			pstat.setInt(5, multiChoiceQuestion.getPoint());
			pstat.setString(6, multiChoiceQuestion.getHints());
			pstat.executeUpdate();
			
				pstat.close();
				connection.close();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateFillBlankQuestion(Question question) {
		// TODO Auto-generated method stub
		/*private String QuestionID;1
		private List<String> content;2
		private List<String> option;3
		private List<String> correctAnswer;4
		private int point;5
		private String hints;6
		*/
		FillBlankQuestion fillBlankQuestion =(FillBlankQuestion) question;
		dbc = new DBConnection();
		connection = dbc.getConnection();
		String sql = "update fillblankquestion set content=?,option=?,correctAnswer=?,point=?,hints=?where QuestionID=?";
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(6, fillBlankQuestion.getQustionID());
			pstat.setString(1, ContentUtil.contentMerge(fillBlankQuestion.getContent()));
			pstat.setString(2, OptionUtil.optionMerge(fillBlankQuestion.getOption()));
			pstat.setString(3, CorrectAnswerUtil.correctAnswerMerge(fillBlankQuestion.getCorrectAnswer()));
			pstat.setInt(4, fillBlankQuestion.getPoint());
			pstat.setString(5, fillBlankQuestion.getHints());
			pstat.executeUpdate();
			
				pstat.close();
				connection.close();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateMultiChoiceQuestion(Question question) {
		// TODO Auto-generated method stub
		/*		
		private String QuestionID;1
	private String content;2
	private List<String> option;3
	private String correctAnswer;4
	private int point;5
	private String hints;6
		*/
		MultiChoiceQuestion multiChoiceQuestion =(MultiChoiceQuestion) question;
		dbc = new DBConnection();
		connection = dbc.getConnection();
		String sql = "update multichoicequestion set content=?,option=?,correctAnswer=?,point=?,hints=?where QuestionID=?";
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(6, multiChoiceQuestion.getQustionID());
			pstat.setString(1, multiChoiceQuestion.getQuestionContent());
			pstat.setString(2, OptionUtil.optionMerge(multiChoiceQuestion.getMcOptions()));
			pstat.setString(3, multiChoiceQuestion.getCorrectAnswer());
			pstat.setInt(4, multiChoiceQuestion.getPoint());
			pstat.setString(5, multiChoiceQuestion.getHints());
			pstat.executeUpdate();
			
				pstat.close();
				connection.close();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteFillBlankQuestion(String QuestionID) {
		// TODO Auto-generated method stub
		dbc = new DBConnection();
		connection = dbc.getConnection();
		String sql = "delete * from fillblankquestion where QuestionID=?";
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, QuestionID);
			pstat.executeUpdate();
			
			sql = "delete * from questionlist where QuestionID=?";
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, QuestionID);
			pstat.executeUpdate();
			
				pstat.close();
				connection.close();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMultiChoiceQuestion(String QuestionID) {
		// TODO Auto-generated method stub
		dbc = new DBConnection();
		connection = dbc.getConnection();
		String sql = "delete * from multichoicequestion where QuestionID=?";
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, QuestionID);
			pstat.executeUpdate();
			
			sql = "delete * from questionlist where QuestionID=?";
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, QuestionID);
			pstat.executeUpdate();
			
				pstat.close();
				connection.close();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
