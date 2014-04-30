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

public class AddMultiChoiceAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession httpSession = request.getSession();
		 Quiz quiz=(Quiz)httpSession.getAttribute("quiz");
		 String quizID =quiz.getQuizID();
		 //String questionID = QuestionUtil.generateMCQuestionID();
		String content = (String)request.getParameter("Content");
		
		ArrayList<String> option = new ArrayList<String>();
		String optionA = (String)request.getParameter("OptionA");
		String optionB = (String)request.getParameter("OptionB");
		String optionC = (String)request.getParameter("OptionC");
		String optionD = (String)request.getParameter("OptionD");
		String optionE = (String)request.getParameter("OptionE");
		
		if(optionA.length() != 0){
			option.add(optionA);
		}
		if(optionA.length() != 0){
			option.add(optionB);
		}
		if(optionA.length() != 0){
			option.add(optionC);
		}
		if(optionA.length() != 0){
			option.add(optionD);
		}
		if(optionA.length() != 0){
			option.add(optionE);
		}
		
		String correctAnswer = (String)request.getParameter("correctAnswer");
		int point = Integer.parseInt(request.getParameter("point"));
		String hints = (String)request.getParameter("hints");
		
		MultiChoiceQuestion question = new MultiChoiceQuestion();
//		if( questionID.length() == 0){
//			System.out.println("question ID is empty.");
//		}else{
//			question.setQustionID(questionID);
//		}
		
		question.setQuestionID("mcqid");
		
		if(content.length() == 0){
			System.out.println("content is empty.");
		}else{
			question.setQuestionContent(content);
		}
		
		if(option.size() == 0){
			System.out.println("opntion is not selected.");
		}else{
			question.setMcOptions(option);
		}
		
		if(correctAnswer.length() == 0){
			System.out.println("there is no correct answer.");
		}else{
			question.setCorrectAnswer(correctAnswer);
		}
		
		if(point == 0 ){
			System.out.println("no points.");
		}else{
			question.setPoint(point);
		}
		
		if(hints.length() == 0){
			System.out.println("no hints.");
		}else{
			question.setHints(hints);
		}
		
		QuestionServiceImpl questionService = new QuestionServiceImpl();
		questionService.addNewMultiChoiceQuestion(question,quizID);
		
		ArrayList<Question> allQuestionList = new ArrayList<Question>();
		//if( questionID != null){
			allQuestionList = questionService.getQuestionListByQuizID(quizID);
		//}
		ArrayList<QuestionTable> questionList=questionService.getQuestionTable(allQuestionList);
		
		httpSession.setAttribute("question", question);
		httpSession.setAttribute("questionList", questionList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teacher/quizMain.jsp");
		dispatcher.forward(request, response);
	}
}
