package com.ols.dao;

import java.util.ArrayList;
import java.util.List;

import com.ols.po.*;
/**
 * @author adil alim
 *
 */

public interface TeacherDAO {
	public Teacher getTeacherByID(String teacherID);
	public void addTeacher(Teacher teacher);
	public void updateTeacher(Teacher teacher);
	public void deleteTeacher(String TeacherID);
	public ArrayList<Course> getTeachCourseList(String teacherID);
	
}
