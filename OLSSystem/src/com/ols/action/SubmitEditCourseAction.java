package com.ols.action;

/**
 * Author Fan Wang by 2014
 * responsible for all 
 * courses list 
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

public class SubmitEditCourseAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		HttpSession httpSession = request.getSession();
		ArrayList<Course> arrCourse = new ArrayList<Course>();
		
		Teacher teacher = (Teacher)httpSession.getAttribute("teacher");		
		String courseID = (String)request.getParameter("CourseID");		
		String courseName =(String) request.getParameter("CourseName");		
		String openSemester =(String) request.getParameter("OpenSemester");
		int credit = Integer.parseInt(request.getParameter("Credit"));
		String state =(String) request.getParameter("State");
		String description =(String) request.getParameter("Description");
		System.out.println("-servlet---------------"+description);
		
		
		CourseServiceImpl courseServiceImpl = new CourseServiceImpl(); 
		Course course =new Course();		
					
					course.setCourseID(courseID);
					course.setCourseName(courseName);
					course.setCredit(credit);
					course.setOpenSemester(openSemester);
					course.setState(state);
					course.setDescription(description);
					
					courseServiceImpl.updateCourse(course);
			
			arrCourse = courseServiceImpl.getCourseByTeacherID(teacher.getTeacherID());
		
	if(arrCourse.size()== 0)
		System.out.println("empty course list of teacher.");
	else{
		arrCourse = courseServiceImpl.getCourseByTeacherID(teacher.getTeacherID());
	}
		httpSession.setAttribute("CourseList", arrCourse);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teacher/index.jsp");
		dispatcher.forward(request, response);
	}


}
