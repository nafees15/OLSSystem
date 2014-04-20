package com.ols.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ols.po.*;
import com.ols.database.DBConnection;

/**
 * @author Zeyang 100
 *
 */

public class StudentDAOImpl implements StudentDAO{
	private static Connection connection;
	private static DBConnection dbc;
	private static PreparedStatement pstat;
	@Override
	public Student getStudentByID(String studentID) {
		// TODO Auto-generated method stub
		Student student = new Student();
		dbc = new DBConnection();
		connection = dbc.getConnection();
		String sql = "SELECT * from student where StudentID=?";
		try {
			pstat = connection.prepareStatement(sql);

			pstat.setString(1, studentID);
			ResultSet urs = (ResultSet) pstat.executeQuery();
			if (urs.next()) {

				student.setStudentID(urs.getString(1));
				student.setSex(urs.getString(2));
				student.setFirstName(urs.getString(3));
				student.setLastName(urs.getString(4));
				student.setDOB(urs.getString(5));
				student.setEmail(urs.getString(6));
				student.setPhoneNumber(urs.getString(7));
				student.setPassword(urs.getString(8));
				urs.close();
				pstat.close();
				connection.close();
			}
			else{
				urs.close();
				pstat.close();
				connection.close();
				return null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
		
		
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		/*
		private String StudentID; 1
		private String Sex;2
		private String FirstName;3
		private String LastName;4
		private Date DOB;5
		private String Email;6
		private String PhoneNumber;7
		private String Password;8

			*/
			String sql = "insert into student values(?,?,?,?,?,?,?,?)";
			try {
				
				pstat = connection.prepareStatement(sql);
				pstat.setString(1, student.getStudentID());
				pstat.setString(2, student.getSex());
				pstat.setString(3, student.getFirstName());
				pstat.setString(4, student.getLastName());
				pstat.setString(5, student.getDOB());
				pstat.setString(6, student.getEmail());
				pstat.setString(7, student.getPhoneNumber());
				pstat.setString(8, student.getPassword());
				
				pstat.executeUpdate();
				pstat.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "update student set sex=?, FirstName=?,LastName=?,DOB=?,Email=?,PhoneNumber=?,Password=? where studentID=?";
		try {
			
			pstat = connection.prepareStatement(sql);
			pstat.setString(8, student.getStudentID());
			pstat.setString(1, student.getSex());
			pstat.setString(2, student.getFirstName());
			pstat.setString(3, student.getLastName());
			pstat.setString(4, student.getDOB());
			pstat.setString(5, student.getEmail());
			pstat.setString(6, student.getPhoneNumber());
			pstat.setString(7, student.getPassword());

			pstat.executeUpdate();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(String studentID) {
		// TODO Auto-generated method stub
		String sql = "delete from student where studentID=?";
		try {		
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, studentID);

			pstat.executeUpdate();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Course> getRegisteredCourseList(String studentID) {
		/*
		 * private String courseID; 1
		private String courseName;2
		private String openSemester;3
		private int credit;4
		private String state;5
		private String description;6
		*/
		ArrayList<Course> courseList = new ArrayList<Course>();
		String sql = "SELECT * from vi_course_register where studentID=?";
		dbc = new DBConnection();
		connection = dbc.getConnection();
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, studentID);
			ResultSet urs = (ResultSet) pstat.executeQuery();
			while (urs.next()) {
				Course course = new Course();
				course.setCourseID(urs.getString(1));
				course.setCourseName(urs.getString(2));
				course.setOpenSemester(urs.getString(3));
				course.setCredit(urs.getInt(4));
				course.setState(urs.getString(5));
				course.setDescription(urs.getString(6));
				courseList.add(course);
			}
			urs.close();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return courseList;
	}

	@Override
	public void registerCourse(String StudentID, String CourseID) {
		// TODO Auto-generated method stub
		String sql = "insert into register values(?,?)";
		try {
			
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, StudentID);
			pstat.setString(2, CourseID);
			
			pstat.executeUpdate();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}