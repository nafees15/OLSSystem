package com.ols.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ols.po.*;
import com.ols.database.DBConnection;

/**
 * @author Zeyang 
 *
 */

public class StudentDAOImpl implements StudentDAO{
	private static Connection connection;
	private static DBConnection dbc;
	private static PreparedStatement pstat;
	@Override
	public Student getStudentByID(String studentID) {
		// TODO Auto-generated method stub
		Student student=new Student();
		dbc=new DBConnection();
		connection=dbc.getConnection();	
				
		//sql query check studentname
		String sql="SELECT * from student where StudentID=?";
		try {
			pstat=connection.prepareStatement(sql);
		
		pstat.setString(1,studentID);	
		ResultSet urs = (ResultSet) pstat.executeQuery();
		   if (urs.next())
		   {
			 
			student.setStudentID(urs.getString(1));
			student.setSex(urs.getString(2));	
			student.setFirstName(urs.getString(3));
			student.setLastName(urs.getString(4));
			student.setDOB(urs.getDate(5));
			student.setEmail(urs.getString(6));
			student.setPhoneNumber(urs.getString(7));
			student.setPassword(urs.getString(8));
			
			urs.close();
			pstat.close();
		    connection.close();
		   
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
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(String studentID) {
		// TODO Auto-generated method stub
		
	}
}