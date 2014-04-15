package com.ols.service;
/**
 * @author Zeyang 100
 *
 */
import java.util.ArrayList;
import java.util.List;

import com.ols.po.Alert;
import com.ols.po.Course;
import com.ols.po.Student;
import com.ols.po.Teacher;
import com.ols.dao.*;

public class TeacherServiceImpl implements TeacherService {
	
	private TeacherDAO teacherDAO=new TeacherDAOImpl();
	@Override
	public boolean allowLogin(String TeacherID, String Password) {
		// TODO Auto-generated method stub
		boolean upchecked = false;
		Teacher teacher = teacherDAO.getTeacherByID(TeacherID);
		if(teacher.getPassword()==Password) upchecked=true;
		else upchecked=false;

		return upchecked;
	}

	@Override
	public Teacher getTeacher(String TeacherID) {
		// TODO Auto-generated method stub
		return teacherDAO.getTeacherByID(TeacherID);
	}

	@Override
	public ArrayList<Course> getTeachCourseListByTeacherID(String teacherID) {
		// TODO Auto-generated method stub
		return teacherDAO.getTeachCourseList(teacherID);
	}

	@Override
	public Alert getTeacherAlertByCourseID(String[] CourseID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}



}
