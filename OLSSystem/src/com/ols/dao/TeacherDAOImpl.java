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
public class TeacherDAOImpl implements TeacherDAO{
	private static Connection connection;
	private static DBConnection dbc;
	private static PreparedStatement pstat;
	@Override
	public Teacher getTeacherByID(String teacherID) {
		// TODO Auto-generated method stub
		Teacher teacher=new Teacher();
		dbc=new DBConnection();
		connection=dbc.getConnection();	
				
		//sql query check teachername
		String sql="SELECT * from teacher where TeacherID=?";
		try {
			pstat=connection.prepareStatement(sql);
		
		pstat.setString(1,teacherID);	
		ResultSet urs = (ResultSet) pstat.executeQuery();
	   if (urs.next())
	   {
		 
		teacher.setTeacherID(urs.getString(1));
		teacher.setSex(urs.getString(2));	
		teacher.setFirstName(urs.getString(3));
		teacher.setLastName(urs.getString(4));
		teacher.setDOB(urs.getDate(5));
		teacher.setEmail(urs.getString(6));
		teacher.setPhoneNumber(urs.getString(7));
		teacher.setPassword(urs.getString(8));
		
		urs.close();
		pstat.close();
	    connection.close();
	   
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
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTeacher(String TeacherID) {
		// TODO Auto-generated method stub
		
	}

}
