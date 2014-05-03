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

import com.ols.po.*;
import com.ols.dao.StudentDAO;
import com.ols.dao.TeacherDAO;
import com.ols.service.*;

public class StuCourseMainAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		HttpSession httpSession = request.getSession();
		String courseID = request.getParameter("courseID");
		Course course = new Course();
		
		if(courseID == null){
			System.out.println("course ID is empty");
			courseID = "";
		}
		
		CourseServiceImpl courseServiceImpl = new CourseServiceImpl();
		QuizServiceImpl quizServiceImpl = new QuizServiceImpl();
		ArrayList<Quiz> arrQuiz = new ArrayList<Quiz>();
		
		if(courseID != null){
			arrQuiz = quizServiceImpl.getQuizByCourseID(courseID);
			course =  courseServiceImpl.getCourse(courseID);
			}
		
		httpSession.setAttribute("course", course);
		httpSession.setAttribute("quizList", arrQuiz);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/student/stuCourseMain.jsp");
		dispatcher.forward(request, response);
	}
}
