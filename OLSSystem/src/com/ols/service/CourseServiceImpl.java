package com.ols.service;

import java.util.ArrayList;


import com.ols.dao.*;
import com.ols.po.Course;

public class CourseServiceImpl {
	private CourseDAO courseDAO=new CourseDAOImpl();
	
	public ArrayList<Course> getCourseByTeacherID(String TeacherID) {
		return courseDAO.getCourseByTeacherID(TeacherID);
	}
	public ArrayList<Course> getCourseByStudentID(String StudentID) {
		return courseDAO.getCourseByStudentID(StudentID);
	}
	public Course getCourse(String CourseID) {
		return courseDAO.getCourseByID(CourseID);
	}
	public void addNewCourse(Course course) {
		courseDAO.addCourse(course);
	}
	public void updateCourse(Course course) {
		courseDAO.updateCourse(course);
	}
	public void deleteCourse(String CourseID){
		courseDAO.deleteCourse(CourseID);
	}
}
