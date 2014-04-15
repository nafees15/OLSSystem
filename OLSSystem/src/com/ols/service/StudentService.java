package com.ols.service;

import java.util.ArrayList;
import java.util.List;

import com.ols.po.*;

/**
 * @author adil alim
 *
 */

public interface StudentService {
	
	public Student getStudent(String StudentID);
	public void addNewStudent(Student student);//un
	
	public boolean allowLogin(String StudentID,String Password);		
	public void setStudentResult(String StudentID);
	public void registerCourse(String CourseID);
	public ArrayList<Course> getRegisteredCourseListByStudentID(String studentID);
}
