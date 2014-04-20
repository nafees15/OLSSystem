/**
 * Author Fan Wang by 2014
 */
package com.ols.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ols.po.Student;
import com.ols.po.Teacher;
import com.ols.po.Course;
import com.ols.dao.StudentDAO;
import com.ols.dao.TeacherDAO;
import com.ols.service.*;

public class LoginAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
		TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl();
		
		Student student = new Student();
		Teacher teacher = new Teacher();
		ArrayList<Course> courses=new ArrayList<Course>();
		HttpSession httpSession =request.getSession();
		
		String url="";
		String roleSelect = request.getParameter("userType");
		String userID =(String) request.getParameter("userID");
		String password =(String) request.getParameter("password");
		
		System.out.println("Login:"+roleSelect+"---"+userID+"---"+password);
		
		if("student".equals(roleSelect)){
			if(studentServiceImpl.allowLogin(userID, password)){
				student = studentServiceImpl.getStudent(userID);
				
				courses = studentServiceImpl.getRegisteredCourseListByStudentID(userID);
				System.out.println("login success check:"+student.getFirstName()+"---"+courses.get(0).getCourseName());
				
				httpSession.setAttribute("student", student);
				httpSession.setAttribute("courses", courses);
				url="/student/index.jsp";
			}else{
			    String errorMsg = "UserID or Password is Wrong.";
			    request.setAttribute("ErrMsg", errorMsg);
				url="/index.jsp";
			}
		}
		if("teacher".equals(roleSelect)){
			if(teacherServiceImpl.allowLogin(userID, password)){
				teacher = teacherServiceImpl.getTeacher(userID);
				courses = teacherServiceImpl.getTeachCourseListByTeacherID(userID);
				
				httpSession.setAttribute("teacher", teacher);
				httpSession.setAttribute("courses", courses);
				url="/teacher/index.jsp";
				
			}else{
			    String errorMsg = "UserID or Password is Wrong.";
			    request.setAttribute("ErrMsg", errorMsg);
				url="/index.jsp";
				
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
}
