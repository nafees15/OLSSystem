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

public class EditCourseAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		HttpSession httpSession = request.getSession();

		
		String courseID = (String) request.getParameter("courseID");
		
		CourseServiceImpl courseServiceImpl = new CourseServiceImpl(); 
		
		Course course = courseServiceImpl.getCourse(courseID);
		request.setAttribute("course", course);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teacher/editCourseTable.jsp");
		dispatcher.forward(request, response);
	}

}
