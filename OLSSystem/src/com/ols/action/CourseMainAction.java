/**
 * Author Fan Wang by 2014
 * This file is responsible 
 * for jumping from courses list page 
 * to single course page for being edited
 *  
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
import com.ols.po.Quiz;
import com.ols.po.Teacher;
import com.ols.po.Student;
import com.ols.dao.StudentDAO;
import com.ols.dao.TeacherDAO;
import com.ols.service.*;

public class CourseMainAction extends HttpServlet{
	
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
		//System.out.println(arrQuiz.size());
		//System.out.println(arrQuiz.get(0).getQuizID());
		httpSession.setAttribute("course", course);
		httpSession.setAttribute("quizList", arrQuiz);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teacher/courseMain.jsp");
		dispatcher.forward(request, response);
		
	}
}
