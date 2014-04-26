package com.ols.util;

import java.util.ArrayList;

public class CorrectAnswerUtil {
	
	public static ArrayList<String> correctAnswerSplit(String correctAnswerInDB) {
		// TODO Auto-generated method stub
		ArrayList<String> correctAnswerList = new ArrayList<String>();
		String strip[] = correctAnswerInDB.split("<splitter>");
		for (int i = 0; i < strip.length; i++) {
			correctAnswerList.add(strip[i]);
		}
		return correctAnswerList; 
	}
	public static String correctAnswerMerge(ArrayList<String> correctAnswerList) {
		// TODO Auto-generated method stub
		String correctAnswerInDB = "";
		for (int i = 0; i < correctAnswerList.size(); i++) {
			correctAnswerInDB = correctAnswerInDB+correctAnswerList.get(i);
			if(i != correctAnswerList.size()-1) correctAnswerInDB += "<splitter>";
		}
		return correctAnswerInDB;
	}
	public static String correctAnswerMergeForTable(ArrayList<String> correctAnswerList) {
		// TODO Auto-generated method stub
		String correctAnswerInDB = "";
		for (int i = 0; i < correctAnswerList.size(); i++) {
			correctAnswerInDB = correctAnswerInDB+correctAnswerList.get(i);
			
		}
		return correctAnswerInDB;
	}
}
