package com.ols.util;

import java.util.ArrayList;

public class OptionUtil {

	public static ArrayList<String> optionSplit(String optionInDB) {
		// TODO Auto-generated method stub
		ArrayList<String> optionList = new ArrayList<String>();
		String strip[] = optionInDB.split("<splitter>");
		for (int i = 0; i < strip.length; i++) {
			optionList.add(strip[i]);
		}
		return optionList;
	}
	
	public static String[] optionSubSplit(String optionInOneBlank) {
		// TODO Auto-generated method stub
		String strip[] = optionInOneBlank.split("<op>");
		return strip;
	}
	
	public static String optionMerge(ArrayList<String> optionList) {
		// TODO Auto-generated method stub
		// contentList = new ArrayList<String>();
		String optionInDB = "";
	
		for (int i = 0; i < optionList.size(); i++) {
			optionInDB = optionInDB+optionList.get(i);
			if(i != optionList.size()-1) optionInDB += "<splitter>";
		}
		return optionInDB;
	}
}
