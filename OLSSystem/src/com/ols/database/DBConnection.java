package com.ols.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.*;

public class DBConnection {
	private Connection connection = null;
	public DBConnection() {
		Properties pro = new Properties(); 
		try {
			// property file path
			String path = "db.properties";			
			pro.load(DBConnection.class.getResourceAsStream(path));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	/*get db properties*/	
	String driver = pro.getProperty("dbDriver"); 
	String url = pro.getProperty("url"); 
	String user = pro.getProperty("userName"); 
	String password = pro.getProperty("password"); 
	
	try {
		Class.forName(driver).newInstance();
		setConnection(DriverManager.getConnection(url, user, password));
	} catch (ClassNotFoundException e) { 
		System.out.println(e.toString());
		System.out.println("DB Connection Failure!!");
	} catch (InstantiationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	
	
}
