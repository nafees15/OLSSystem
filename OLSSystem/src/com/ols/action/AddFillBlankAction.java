/**
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

public class AddFillBlankAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//private String questionID;
		//private ArrayList<String> content;
		//private ArrayList<String> option;
		//private ArrayList<String> correctAnswer;
		//private int point;
		//private String hints;
		HttpSession httpSession = request.getSession();
		Quiz quiz=(Quiz)httpSession.getAttribute("quiz");
		 String quizID =quiz.getQuizID();
//		String questionID = QuestionUtil.generateFBQuestionID();
		
//--------------------------content----------------------------------------------------\\
		ArrayList<String> content = new ArrayList<String>();
		String content1 = (String)request.getParameter("content1");
		String content2 = (String)request.getParameter("content2");
		String content3 = (String)request.getParameter("content3");
		if(content1.length() != 0){
			content.add(content1);
		}
		if(content2.length() != 0){
			content.add(content2);
		}
		if(content3.length() != 0){
			content.add(content3);
		}
//--------------------------content end------------------------------------------------\\
//-----------------------------option execution-----------------------------------------\\		
		ArrayList<String> option = new ArrayList<String>();
		String op1_1 = (String)request.getParameter("1op1");
		String op1_2 = (String)request.getParameter("1op2");
		String op1_3 = (String)request.getParameter("1op3");		
		if(op1_2.length() == 0){
			op1_2 = "";
		}		
		String subStr_1  = op1_1 + "<op>" + op1_2 + "<op>" + op1_3;
		
		String op2_1 = (String)request.getParameter("2op1");
		String op2_2 = (String)request.getParameter("2op2");
		String op2_3 = (String)request.getParameter("2op3");
		if(op2_2.length() == 0){
			op2_2 = "";
		}
		String subStr_2  = op2_1 + "<op>" + op2_2 + "<op>" + op2_3;
		
		String op3_1 = (String)request.getParameter("3op1");
		String op3_2 = (String)request.getParameter("3op2");
		String op3_3 = (String)request.getParameter("3op3");
		if(op3_2.length() == 0){
			op3_2 = "";
		}
		String subStr_3  = op3_1 + "<op>" + op3_2 + "<op>" + op3_3;
		
		option.add(subStr_1);
		option.add(subStr_2);
		option.add(subStr_3);
//--------------------------------option end--------------------------------\\		
//------------------------correct answer-------------------------------------		
		ArrayList<String> correctAnswer = new ArrayList<String>();
		String  correctAns1 = request.getParameter("correctAnswer1");
		String  correctAns2 = request.getParameter("correctAnswer2");
		String  correctAns3 = request.getParameter("correctAnswer3");
		
		if( correctAns1.length() != 0){
			correctAnswer.add(correctAns1);
		}
		if( correctAns2.length() != 0){
			correctAnswer.add(correctAns2);
		}
		if( correctAns3.length() != 0){
			correctAnswer.add(correctAns3);
		}
//------------------------correct answer end----------------------------------\\
		FillBlankQuestion question = new FillBlankQuestion();
		
		int point = Integer.parseInt(request.getParameter("point"));
		String hints = (String)request.getParameter("hints");
//========================check safety for attributes=================================		
//		if(questionID.length() == 0){
//			System.out.println("Question ID is empty.");
//		}else{
//			question.setQuestionID(questionID);
//		}
		question.setQuestionID("fbqid");
		if(content.size() == 0){
			System.out.println("should add content.");
		}else{
			question.setContent(content);
		}
		
		if(option.size() == 0){
			System.out.println("should add option.");
		}else{
			question.setOption(option);
		}
		
		if(correctAnswer.size() == 0){
			System.out.println("there is not correct answer.");
		}else{
			question.setCorrectAnswer(correctAnswer);
		}
		
		if(point == 0){
			System.out.println("do not set points for quesiton.");
		}else{
			question.setPoint(point);
		}
		
		if(hints.length() == 0){
			System.out.println("did not set hints.");
		}else{
			question.setHints(hints);
		}
		
		QuestionServiceImpl questionService = new QuestionServiceImpl();
		questionService.addNewFillBlankQuestion(question,quizID);
//================================call total questions==================================		
		ArrayList<Question> allQuestionList = new ArrayList<Question>();
//		if( questionID != null){
			allQuestionList = questionService.getQuestionListByQuizID(quizID);
//		}
		ArrayList<QuestionTable> questionList = questionService.getQuestionTable(allQuestionList);
//======================================================================================		
		httpSession.setAttribute("question", question);
		httpSession.setAttribute("questionList", questionList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teacher/quizMain.jsp");
		dispatcher.forward(request, response);
	}

}
