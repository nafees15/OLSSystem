package com.ols.util;

import java.util.ArrayList;
import java.util.HashMap;

import com.ols.po.*;

public class QuestionUtil {
	public static String mcOptionGenerator(ArrayList<String> mcOptionList, String questionID) {
		String str = "";
		int i = 0;
		for(String mcOption: mcOptionList) {
			str += "</br><Input type=\"Checkbox\" Name=\""+questionID+"\" value=\""+(char)('A'+i)+"\">"+(char)('A'+i)+". "+mcOption;
			i++;
		}
		return str;
	}
	
	public static String generateOption(String sourceStr, String questionID, int indexOption) {
		/*<select name="OpenSemester">
		  <option value="2014summer">2014 Summer</option>
		  <option value="2014fall">2014 Fall</option>	
		  <option value="2015winter">2015 Winter</option>	
		  <option value="2015spring">2015 Spring</option>					  
				</select>*/
		String[] strip = OptionUtil.optionSubSplit(sourceStr);
		String str = "";
		str += "<select name=\""+questionID+"_blank"+ (indexOption+1)+"\">";
		for(int j=1;j<=3;j++)
			str += "<option value=\""+j+"\">"+strip[j-1]+"</option>";
		str += "</select>";
		return str;
	}
	
	public static HashMap<String, String> questionDisplay(ArrayList<Question> questionList) {
	/*	private String QuestionID;
		private ArrayList<String> content;
		private ArrayList<String> option;
		private ArrayList<String> correctAnswer;
		private int point;
		private String hints;*/
		HashMap<String, String> hashmap = new HashMap<String, String>();
		
		String str= "";
		//int index = 1;
		for(Question question:questionList) { 
			
			str= (". ");
			if(question.getType() == Question.MULTI_CHOICE_TYPE) {
				MultiChoiceQuestion multiChoiceQuestion = (MultiChoiceQuestion) question;
				str += multiChoiceQuestion.getQuestionContent();
				str += QuestionUtil.mcOptionGenerator(multiChoiceQuestion.getMcOptions(),multiChoiceQuestion.getQuestionID());
				str += "</br></br>";
				hashmap.put(multiChoiceQuestion.getQuestionID(),str);
			}
			if(question.getType() == Question.FILL_BLANK_TYPE) {
				FillBlankQuestion fillBlankQuestion = (FillBlankQuestion) question;		
				for(int index_g=0;index_g<fillBlankQuestion.getContent().size();index_g++){
					str += fillBlankQuestion.getContent().get(index_g);
					if(fillBlankQuestion.getOption().get(index_g)!=null)
						str += QuestionUtil.generateOption(fillBlankQuestion.getOption().get(index_g),fillBlankQuestion.getQuestionID(),index_g);				
				}
				str += "</br></br>";
				hashmap.put(fillBlankQuestion.getQuestionID(),str);
			}
			//index++;
		}
		return hashmap;
		
	}
}
