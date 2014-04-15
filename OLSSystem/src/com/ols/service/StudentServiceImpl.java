package com.ols.service;
/**
 * @author Zeyang 100
 *
 */
import java.util.ArrayList;
import java.util.List;

import com.ols.po.*;
import com.ols.dao.*;

public class StudentServiceImpl implements StudentService{
	
	private StudentDAO studentDAO=new StudentDAOImpl();
	public boolean allowLogin(String StudentID,String Password) {
		boolean upchecked = false;
		Student student = studentDAO.getStudentByID(StudentID);
		if(student.getPassword()==Password) upchecked=true;
		else upchecked=false;

		return upchecked;
	}

	@Override
	public Student getStudent(String StudentID) {
		// TODO Auto-generated method stub
		return studentDAO.getStudentByID(StudentID);

	}

	@Override
	public ArrayList<Course> getRegisteredCourseListByStudentID(String studentID) {
		// TODO Auto-generated method stub
		return studentDAO.getRegisteredCourseList(studentID);
		
	}

	@Override
	public void setStudentResult(String StudentID) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void registerCourse(String CourseID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}
