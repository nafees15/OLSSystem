/*
 * Author Fan Wang by 2014
 */
package com.ols.action;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

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

public class SubmitQuizAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession httpSession = request.getSession();
		
		Quiz quiz = (Quiz)httpSession.getAttribute("quiz");
		Course course = (Course)httpSession.getAttribute("course");
		String quizID = (String)quiz.getQuizID();
		Student student = (Student)httpSession.getAttribute("student");		
		String studentID=student.getStudentID();
		System.out.println("9999999999999999"+studentID);
		HashMap<String,String> totalQuestion = (HashMap<String,String>)httpSession.getAttribute("questionList");
		HashMap<String,String> questionIDMapToCorrectAnswer = new HashMap<String,String>();
		totalQuestion = (HashMap<String,String>)httpSession.getAttribute("questionList");
				
			
		
		for(Entry<String, String> entry: totalQuestion.entrySet()){
			String questionID = entry.getKey();
//			System.out.println(questionID);	
			System.out.println(questionID+"submit id");
			if(questionID.toLowerCase().contains("mc")){
				String correctAnswerForMC = "";
				String[] mcAnswer = (String[])request.getParameterValues(questionID);
				for(int i = 0; i < mcAnswer.length; i++){
					if(mcAnswer[i].length() == 0)
						mcAnswer[i] = "";
					System.out.println(mcAnswer[i]+"-");
					correctAnswerForMC =correctAnswerForMC+ mcAnswer[i];
				}
				
				questionIDMapToCorrectAnswer.put(questionID, correctAnswerForMC);
				System.out.println(correctAnswerForMC+" answerFB");
			}
			else if(questionID.toLowerCase().contains("fb")){
				String[] fbAnswer={"","",""};
				String correctAnswerForFB = "";
				for(int i = 0; i < 3; i++){
				//System.out.println(request.getParameter(questionID+"_blank"+(i+1)));
				fbAnswer[i] = (String)request.getParameter(questionID+"_blank"+(i+1));
				
				}
				for(int i = 0; i < fbAnswer.length; i++){
					if(fbAnswer[i].length() == 0)
						fbAnswer[i] = "0";
					correctAnswerForFB = correctAnswerForFB+fbAnswer[i] + "<splitter>";
				}
				correctAnswerForFB = correctAnswerForFB.substring(0, correctAnswerForFB.length() - 10);
				System.out.println(correctAnswerForFB+" answer");
				questionIDMapToCorrectAnswer.put(questionID, correctAnswerForFB);
			}
		}
		ArrayList<Quiz> arrQuiz = new ArrayList<Quiz>();
		QuizServiceImpl quizServiceImpl = new QuizServiceImpl();
		System.out.println("---------"+course.getCourseID());
		arrQuiz = quizServiceImpl.getQuizByCourseID(course.getCourseID());
		
		httpSession.setAttribute("quizList", arrQuiz);
		QuizServiceImpl quizService = new QuizServiceImpl();
		quizService.calculateGrades(questionIDMapToCorrectAnswer, studentID, quizID);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/student/stuCourseMain.jsp");
		dispatcher.forward(request, response);

	}

}
