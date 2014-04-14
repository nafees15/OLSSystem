package com.ols.service;

import java.util.List;

import com.ols.po.*;
/**
 * @author adil alim
 *
 */

public interface TeacherService {
	public boolean allowLogin(String TeacherID,String Password);
	public Teacher getTeacherInfo(String TeacherID);
	public List<Course> getOpenedCourseList(String teacherID);
	public void addCourse(Course course);
	public Alert getTeacherAlertByCourseID(String[] CourseID);
	
}
