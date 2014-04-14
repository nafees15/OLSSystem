package com.ols.service;

import java.util.List;

import com.ols.po.Alert;
import com.ols.po.Course;
import com.ols.po.Teacher;

public class TeacherServiceImpl implements TeacherService {

	@Override
	public boolean allowLogin(String TeacherID, String Password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Teacher getTeacherInfo(String TeacherID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getOpenedCourseList(String teacherID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alert getTeacherAlertByCourseID(String[] CourseID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

}
