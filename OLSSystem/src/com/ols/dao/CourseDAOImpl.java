package com.ols.dao;

/**
 * @author Zeyang 100
 *
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ols.database.DBConnection;
import com.ols.po.Course;
import com.ols.po.Quiz;

public class CourseDAOImpl implements CourseDAO {
	private static Connection connection;
	private static DBConnection dbc;
	private static PreparedStatement pstat;

	/*
	 * private String QuizID; private String QuizName; private Date DueTime;
	 * private float QuizFullGrade; private int TotalQuestionNumber; private
	 * String CourseID;
	 */

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
				quiz.setDueTime(urs.getDate(3));
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

	public void addCourse(Course course){
		/*private String courseID;1
		private String courseName;2
		private String openSemester;3
		private int credit;4
		private String state;5
		private String description;6
		*/
		String sql = "insert into course values(?,?,?,?,?,?)";
		try {
			
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, course.getCourseID());
			pstat.setString(2, course.getCourseName());
			pstat.setString(3, course.getOpenSemester());
			pstat.setInt(4, course.getCredit());
			pstat.setString(5, course.getState());
			pstat.setString(6, course.getDescription());
			
			pstat.executeQuery();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//course is a new course that ID not change, other attributes changed
	public void updateCourse(Course course) {
		String sql = "update course set courseName=?, OpenSemester=?,Credit=?,State=?,Description=? where courseID=?";
		try {
			
			pstat = connection.prepareStatement(sql);
			pstat.setString(6, course.getCourseID());
			pstat.setString(1, course.getCourseName());
			pstat.setString(2, course.getOpenSemester());
			pstat.setInt(3, course.getCredit());
			pstat.setString(4, course.getState());
			pstat.setString(5, course.getDescription());

			pstat.executeQuery();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteCourse(String CourseID) {
		String sql = "delete from course where courseID=?";
		try {		
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, CourseID);

			pstat.executeQuery();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Course> getCourseByTeacherID(String TeacherID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Course> getCourseByStudentID(String StudentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourseByID(String CourseID) {
		// TODO Auto-generated method stub
		return null;
	}
}
