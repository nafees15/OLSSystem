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

//import com.ols.po.Course;
import com.ols.po.Quiz;
//import com.ols.po.Teacher;
//import com.ols.po.Student;
//import com.ols.dao.StudentDAO;
//import com.ols.dao.TeacherDAO;
import com.ols.service.*;

public class EditQuizAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		HttpSession httpSession = request.getSession();
		String CourseID = request.getParameter("CourseID");
		
		//Quiz part
		String QuizID = request.getParameter("QuizID");
		String QuizName = request.getParameter("QuizName");
		String DueDate = request.getParameter("bdaytime");
		float QuizFullGrade = Float.parseFloat(request.getParameter("QuizFullGrade"));
		int TotalQuestionNumber = Integer.parseInt(request.getParameter("QuizFullGrade"));
		
		//Quiz quiz = new Quiz();
		QuizServiceImpl quizServiceImpl = new QuizServiceImpl();
		ArrayList<Quiz> arrQuiz = new ArrayList<Quiz>();
		
		if(CourseID != ""){
			arrQuiz = quizServiceImpl.getQuizByCourseID(CourseID);
			for(Quiz quiz : arrQuiz){
				if(quiz.getQuizID().equalsIgnoreCase(QuizID)){
					quiz.setQuizID(QuizID);
					quiz.setQuizName(QuizName);
					quiz.setDueTime(DueDate);
					quiz.setQuizFullGrade(QuizFullGrade);
					quiz.setTotalQuestionNumber(TotalQuestionNumber);
					quizServiceImpl.updateQuiz(quiz);
				}
			}//end for
			arrQuiz = quizServiceImpl.getQuizByCourseID(CourseID);	
		}//end if
		
		httpSession.setAttribute("QuizList", arrQuiz);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teacher/addQuizTable.jsp");
		dispatcher.forward(request, response);
		
	}

}
