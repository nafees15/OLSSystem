package com.ols.service;

import java.util.ArrayList;

import com.ols.dao.QuestionDAOImpl;
import com.ols.po.FillBlankQuestion;
import com.ols.po.MultiChoiceQuestion;
import com.ols.po.Question;
import com.ols.po.QuestionTable;
import com.ols.util.ContentUtil;
import com.ols.util.CorrectAnswerUtil;

public class QuestionServiceImpl implements QuestionService{
	
	private QuestionDAOImpl questionDAO=new QuestionDAOImpl();
	@Override
	public 	ArrayList<QuestionTable> getQuestionTable(ArrayList<Question> allQuestionList) {
		/*private String QuestionID;
		private String content;
		private String correctAnswer;*/
		ArrayList<QuestionTable> questionTableList = new ArrayList<QuestionTable>();
		for(Question question:allQuestionList){
			QuestionTable questionTable = new QuestionTable();
			if(question.getType()==Question.FILL_BLANK_TYPE) {
				FillBlankQuestion fillBlankQuestion = (FillBlankQuestion)question;
				questionTable.setQuestionID(fillBlankQuestion.getQuestionID());
				questionTable.setContent(ContentUtil.contentMergeForTable(fillBlankQuestion.getContent()));
				questionTable.setCorrectAnswer(CorrectAnswerUtil.correctAnswerMergeForTable(fillBlankQuestion.getCorrectAnswer()));
			}
			if(question.getType()==Question.MULTI_CHOICE_TYPE) {
				MultiChoiceQuestion multiChoiceQuestion = (MultiChoiceQuestion)question;
				questionTable.setQuestionID(multiChoiceQuestion.getQuestionID());
				questionTable.setContent(multiChoiceQuestion.getQuestionContent());
				questionTable.setCorrectAnswer(multiChoiceQuestion.getCorrectAnswer());
			}
			questionTableList.add(questionTable);
		}
		return questionTableList;
	}
	
	public ArrayList<Question> getQuestionListByQuizID(String QuizID) {
		// TODO Auto-generated method stub
		ArrayList<Question> fillblankquestionList = new ArrayList<Question>();
		fillblankquestionList = questionDAO.getFillBlankQuestionList(QuizID);
		
		ArrayList<Question> multichoicequestionList = new ArrayList<Question>();
		multichoicequestionList = questionDAO.getMultiChoiceQuestionList(QuizID);
		
		ArrayList<Question> newList = new ArrayList<Question>();
		newList.addAll(fillblankquestionList);
		newList.addAll(multichoicequestionList);
		return newList;
	}

	@Override
	public FillBlankQuestion getFillBlankQuestion(String QuestionID) {
		// TODO Auto-generated method stub
		return questionDAO.getFillBlankQuestion(QuestionID);
	}

	@Override
	public MultiChoiceQuestion getMultiChoiceQuestion(String QuestionID) {
		// TODO Auto-generated method stub
		return questionDAO.getMultiChoiceQuestion(QuestionID);
	}

	@Override
	public ArrayList<Question> getFillBlankQuestionList(String QuizID) {
		// TODO Auto-generated method stub
		return questionDAO.getFillBlankQuestionList(QuizID);
	}

	@Override
	public ArrayList<Question> getMultiChoiceQuestionList(String QuizID) {
		// TODO Auto-generated method stub
		return questionDAO.getMultiChoiceQuestionList(QuizID);
	}

	@Override
	public String addNewFillBlankQuestion(Question question, String quizID) {
		// TODO Auto-generated method stub
		return questionDAO.addFillBlankQuestion(question, quizID);
	}

	@Override
	public String addNewMultiChoiceQuestion(Question question, String quizID) {
		// TODO Auto-generated method stub
		return questionDAO.addMultiChoiceQuestion(question, quizID);
	}

	@Override
	public void updateFillBlankQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDAO.updateFillBlankQuestion(question);
	}

	@Override
	public void updateMultiChoiceQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDAO.updateMultiChoiceQuestion(question);
	}

	@Override
	public void deleteFillBlankQuestion(String QuestionID) {
		// TODO Auto-generated method stub
		questionDAO.deleteFillBlankQuestion(QuestionID);
	}

	@Override
	public void deleteMultiChoiceQuestion(String QuestionID) {
		// TODO Auto-generated method stub
		questionDAO.deleteMultiChoiceQuestion(QuestionID);
	}
	
}
