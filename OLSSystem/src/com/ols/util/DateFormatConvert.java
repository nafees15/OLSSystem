package com.ols.util;

import java.util.*;
public class DateFormatConvert {

	public static java.util.Date SqlDateToJavaDate(java.sql.Date sqldate){		
		java.util.Date utildate=new java.util.Date();
		utildate=new java.util.Date(sqldate.getTime());
		return utildate;
	}
	
	public static java.util.Date JavaDateToSqlDate(java.util.Date utildate){		
		java.sql.Date sqldate=new java.sql.Date (utildate.getTime());
		return sqldate;
	}
}
