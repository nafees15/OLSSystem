package com.ols.util;

import java.util.ArrayList;

public class ContentUtil {
	
	public static ArrayList<String> contentSplit(String contentInDB) {
		// TODO Auto-generated method stub
		ArrayList<String> contentList = new ArrayList<String>();
		String strip[] = contentInDB.split("<splitter>");
		for (int i = 0; i < strip.length; i++) {
			contentList.add(strip[i]);
		}
		return contentList;
	}
	public static String contentMerge(ArrayList<String> contentList) {
		// TODO Auto-generated method stub
		// contentList = new ArrayList<String>();
		String contentInDB = "";
	//	String strip[] = contentInDB.split("[<splitter>]+");
		for (int i = 0; i < contentList.size(); i++) {
			contentInDB = contentInDB+contentList.get(i);
			if(i != contentList.size()-1) contentInDB += "<splitter>";
		}
		return contentInDB;
	}
}
