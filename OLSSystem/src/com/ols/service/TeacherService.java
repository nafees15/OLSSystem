package com.ols.service;

import java.util.ArrayList;
import java.util.List;

import com.ols.po.*;
/**
 * @author adil alim
 *
 */

public interface TeacherService {
	public boolean allowLogin(String TeacherID,String Password);
	public Teacher getTeacher(String TeacherID);
	public void addNewTeacher(Teacher teacher);
	public void updateTeacher(Teacher teacher);
	public void deleteTeacher(Teacher teacher);
	public ArrayList<Course> getTeachCourseListByTeacherID(String teacherID);	
	public Alert getTeacherAlertByCourseID(String[] CourseID);
	
	
}
