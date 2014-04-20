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
public class TeacherDAOImpl implements TeacherDAO{
	private static Connection connection;
	private static DBConnection dbc;
	private static PreparedStatement pstat;
	@Override
	public Teacher getTeacherByID(String teacherID) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		dbc = new DBConnection();
		connection = dbc.getConnection();

		// sql query check teachername
		String sql = "SELECT * from teacher where TeacherID=?";
		try {
			pstat = connection.prepareStatement(sql);

			pstat.setString(1, teacherID);
			ResultSet urs = (ResultSet) pstat.executeQuery();
			if (urs.next()) {

				teacher.setTeacherID(urs.getString(1));
				teacher.setSex(urs.getString(2));
				teacher.setFirstName(urs.getString(3));
				teacher.setLastName(urs.getString(4));
				teacher.setDOB(urs.getString(5));
				teacher.setEmail(urs.getString(6));
				teacher.setPhoneNumber(urs.getString(7));
				teacher.setPassword(urs.getString(8));

				urs.close();
				pstat.close();
				connection.close();

			} else {
				urs.close();
				pstat.close();
				connection.close();
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teacher;
		
		
	}

	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		/*
	private String TeacherID; 1
	private String Sex;2
	private String FirstName;3
	private String LastName;4
	private String DOB;5
	private String Email;6
	private String PhoneNumber;7
	private String Password;8
		*/

		dbc = new DBConnection();
		connection = dbc.getConnection();
		String sql = "insert into teacher values(?,?,?,?,?,?,?,?)";
		try {
			
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, teacher.getTeacherID());
			pstat.setString(2, teacher.getSex());
			pstat.setString(3, teacher.getFirstName());
			pstat.setString(4, teacher.getLastName());
			pstat.setString(5, teacher.getDOB());
			pstat.setString(6, teacher.getEmail());
			pstat.setString(7, teacher.getPhoneNumber());
			pstat.setString(8, teacher.getPassword());
			
			pstat.executeUpdate();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		/*
		private String TeacherID; 1
		private String Sex;2
		private String FirstName;3
		private String LastName;4
		private String DOB;5
		private String Email;6
		private String PhoneNumber;7
		private String Password;8
			*/

		dbc = new DBConnection();
		connection = dbc.getConnection();
		
		String sql = "update teacher set sex=?, FirstName=?,LastName=?,DOB=?,Email=?,PhoneNumber=?,Password=? where teacherID=?";
		try {
			
			pstat = connection.prepareStatement(sql);
			pstat.setString(8, teacher.getTeacherID());
			pstat.setString(1, teacher.getSex());
			pstat.setString(2, teacher.getFirstName());
			pstat.setString(3, teacher.getLastName());
			pstat.setString(4, teacher.getDOB());
			pstat.setString(5, teacher.getEmail());
			pstat.setString(6, teacher.getPhoneNumber());
			pstat.setString(7, teacher.getPassword());

			pstat.executeUpdate();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteTeacher(String TeacherID) {

		dbc = new DBConnection();
		connection = dbc.getConnection();
		
		// TODO Auto-generated method stub
		String sql = "delete from teacher where teacherID=?";
		try {		
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, TeacherID);

			pstat.executeUpdate();
			pstat.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Course> getTeachCourseList(String teacherID) {
		ArrayList<Course> courseList = new ArrayList<Course>();
		String sql = "SELECT * from vi_course_teach where teacherID=?";
		dbc = new DBConnection();
		connection = dbc.getConnection();
		try {
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, teacherID);
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
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return courseList;
	}

	public void teachCourse(String TeacherID, String CourseID) {
		

		dbc = new DBConnection();
		connection = dbc.getConnection();
		
		String sql = "insert into teach values(?,?)";
		try {
			
			pstat = connection.prepareStatement(sql);
			pstat.setString(1, TeacherID);
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
