/**
 * Author Fan Wang by 2014
 */
package com.ols.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ols.po.Student;
import com.ols.po.Teacher;
import com.ols.dao.StudentDAO;
import com.ols.dao.TeacherDAO;
import com.ols.service.*;
import com.ols.service.TeacherService;

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
		
		HttpSession httpSession =request.getSession();
		
		String url="";
		String roleSelect = request.getParameter("userType");
		String username =(String) request.getParameter("userID");
		String password =(String) request.getParameter("password");
		
		System.out.println("Login:"+roleSelect+"---"+username+"---"+password);
		
		if("student".equals(roleSelect)){
			if(studentServiceImpl.allowLogin(username, password)){
				student = studentServiceImpl.getStudentInfo(username);
				System.out.println("login success check:"+student.getFirstName()+"---"+student.getLastName());
				httpSession.setAttribute("student", student);
				url="/student/index.jsp";
			}else{
			    String errorMsg = "there is error of username/password.";
			    httpSession.setAttribute("ErrMsg", errorMsg);
				url="/index.jsp";
			}
		}
		if("teacher".equals(roleSelect)){
			if(teacherServiceImpl.allowLogin(username, password)){
				teacher = teacherServiceImpl.getTeacherInfo(username);
				httpSession.setAttribute("teacher", teacher);
				url="/teacher/index.jsp";
				
			}else{
			    String errorMsg = "there is error of username/password.";
			    httpSession.setAttribute("ErrMsg", errorMsg);
				url="/index.jsp";
				
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
}
