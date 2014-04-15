package com.ols.action;

/**
 * Author Fan Wang by 2014
 */

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ols.po.Course;
import com.ols.po.Teacher;
import com.ols.po.Student;
import com.ols.dao.StudentDAO;
import com.ols.dao.TeacherDAO;
import com.ols.service.*;
import com.ols.service.TeacherService;

public class EditCourseAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		HttpSession httpSession = request.getSession();
		
		String teacherID = request.getParameter("TeacherID");
		String courseID = request.getParameter("CourseID");
		String courseName = request.getParameter("CourseName");
		String openSemester = request.getParameter("OpenSemester");
		int credit = Integer.parseInt(request.getParameter("Credit"));
		String state = request.getParameter("State");
		String description = request.getParameter("Description");
		
		//Course course = null;
		ArrayList<Course> arrCourse = new ArrayList<Course>();
		CourseServiceImpl courseServiceImpl = new CourseServiceImpl(); 
		
		arrCourse = courseServiceImpl.getCourseByTeacherID(teacherID);
		if(arrCourse.size()== 0)
			System.out.println("empty course list of teacher.");
		else{
			for(Course course : arrCourse){
				if(course.getCourseID().equalsIgnoreCase(courseID)){
					course.setCourseID(courseID);
					course.setCourseName(courseName);
					course.setCredit(credit);
					course.setOpenSemester(openSemester);
					course.setState(state);
					course.setDescription(description);
					
					courseServiceImpl.updateCourse(course);
				}
			}
			arrCourse = courseServiceImpl.getCourseByTeacherID(teacherID);
		}
		
		httpSession.setAttribute("CourseList", arrCourse);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teacher/addCourseTable.jsp");
		dispatcher.forward(request, response);
	}


}
