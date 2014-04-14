package com.ols.service;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ols.po.*;
import com.ols.database.DBConnection;

public class StudentServiceImpl implements StudentService{
	private static Connection connection;
	private static DBConnection dbc;
	private static PreparedStatement pstat;
	
	public boolean allowLogin(String StudentID,String Password) {
		boolean upchecked=false;
		System.out.println("Allow"+StudentID+"---"+Password);
		dbc=new DBConnection();
		connection=dbc.getConnection();
		//System.out.println("cheking 4:---------"+username+" "+password);
		//fisrt check the username exist,if exist then check username and c		
		//sql query check username and password
		String sql="SELECT * from student where StudentID=? and Password=?";
		try {
			 pstat=connection.prepareStatement(sql);
		
		pstat.setString(1,StudentID);
		pstat.setString(2,Password);
		ResultSet uprs = (ResultSet) pstat.executeQuery();
		   if (uprs.next())
		   {
			upchecked= true;
		   } 
		    uprs.close();
		    pstat.close();
		    
		   
		   connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		   
		   return upchecked;
	}

	@Override
	public Student getStudentInfo(String StudentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getResisteredCourseList(String studentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStudentResult(String StudentID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerCourse(String CourseID) {
		// TODO Auto-generated method stub
		
	}

}
