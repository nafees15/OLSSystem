/**
 * Author Fan Wang by 2014
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
import com.ols.service.CourseService;
import com.ols.service.*;
import com.ols.service.TeacherService;

public class AddCourseAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		HttpSession httpSession = request.getSession();
		Teacher teacher=(Teacher)httpSession.getAttribute("teacher");
		String teacherID = teacher.getTeacherID();
		
		System.out.println("Addcourse action:----teacherid:--"+teacherID);
		String courseID = request.getParameter("CourseID");
		String courseName = request.getParameter("CourseName");
		String openSemester = request.getParameter("OpenSemester");
		int credit = Integer.parseInt(request.getParameter("Credit"));
		String state = request.getParameter("State");
		String description = request.getParameter("Description");
		
		Course course = new Course();
		ArrayList<Course> courses = new ArrayList<Course>();
		CourseServiceImpl courseService = new CourseServiceImpl(); 
		
		if(teacherID.length()==0) teacherID ="";
		System.out.println("Teacher ID is"+ teacherID);
		
		if(teacherID != ""){
			course.setCourseID(courseID);
			course.setCourseName(courseName);
			course.setOpenSemester(openSemester);
			course.setCredit(credit);
			course.setState(state);
			course.setDescription(description);
			
			courseService.addNewCourse(course, teacherID);
		}else{
			System.out.println("There is no course added");
		}
		courses=courseService.getCourseByTeacherID(teacherID);
		httpSession.setAttribute("courses", courses);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teacher/index.jsp");
		dispatcher.forward(request, response);
	}
	
}
