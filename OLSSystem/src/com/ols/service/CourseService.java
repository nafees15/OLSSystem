package com.ols.service;

import java.util.ArrayList;

import com.ols.po.*;

/**
 * @author adil alim
 *
 */

public interface CourseService {
	public ArrayList<Course> getCourseByTeacherID(String TeacherID);
	public ArrayList<Course> getCourseByStudentID(String StudentID);
	public Course getCourse(String CourseID);
	public void addNewCourse(Course course);
	public void updateCourse(Course sourse);
	public void deleteCourse(String CourseID);
	
}
