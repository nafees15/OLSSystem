/**
 * Author Fan Wang by 2014
 * responsible for just one
 * course 
 */
package com.ols.action;

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

public class EditOneCourseAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		HttpSession httpSession = request.getSession();
		
		Teacher teacher = (Teacher)httpSession.getAttribute("teacher");
		
		String courseID = request.getParameter("CourseID");		
		String courseName = request.getParameter("CourseName");		
		String openSemester = request.getParameter("OpenSemester");
		int credit = Integer.parseInt(request.getParameter("Credit"));
		String state = request.getParameter("State");
		String description = request.getParameter("Description");
		
		if(courseID != null){
			System.out.println("course ID is empty.");
			courseID = "";
		}
		
		//Course course = null;
		Course course = new Course();
		CourseServiceImpl courseServiceImpl = new CourseServiceImpl(); 
		
		//arrayListCourse = courseServiceImpl.getCourseByTeacherID(teacher.getTeacherID());
		if(courseServiceImpl.getCourse(courseID) != null){
			course.setCourseID(courseID);
			course.setCourseName(courseName);
			course.setCredit(credit);
			course.setOpenSemester(openSemester);
			course.setState(state);
			course.setDescription(description);
					
			courseServiceImpl.updateCourse(course);
		}else{
			System.out.println("Course object is null");
		}
		
		course = courseServiceImpl.getCourse(courseID);
		httpSession.setAttribute("course", course);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teacher/addCourseTable.jsp");
		dispatcher.forward(request, response);
	}

}
