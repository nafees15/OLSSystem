package com.ols.dao;

import java.util.List;

import com.ols.po.*;
/**
 * @author adil alim
 *
 */

public interface CourseDAO {
	public List<Quiz> getQuizByCourseID(String CourseID);
	public void addCourse(Course course);
	public void updateCourse(Course course);
	public void deleteCourse(String CourseID);
	
}
