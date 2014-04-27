/**
 *  Author Fan Wang by 2014
 */

package com.ols.action;

import java.io.IOException;
import java.util.*;

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

public class SignupAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		HttpSession httpSession = request.getSession();
		
		String netID = request.getParameter("NetID");
		String sex = request.getParameter("Sex");
		String firstname = request.getParameter("FirstName");
		String lastname = request.getParameter("LastName");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		String phonenumber = request.getParameter("phonenumber");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirmpassword");
		
		String message = "";
		
		Student student = new Student();
		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
		if( studentServiceImpl.getStudent(netID) != null){
			System.out.println("student already exists.");
			message = "student already exists.";
		}
		else if(sex.length() == 0){
			System.out.println("Sex info is empty.");
			message = "sex is empty.";
		}
		else if(firstname.length() == 0){
			System.out.println("first name need to fill in.");
			message = "first name is empty."; 
		}
		else if(lastname.length() == 0){
			System.out.println("last name need to fill in.");
			message = "last name is empty."; 
		}
		else if(dob.length() == 0){
			System.out.println("Birth of date is empty.");
			message = "dob is empty.";
		}
		else if(email.length()== 0){
			System.out.println("email address is empty.");
			message = "email is empty.";
		}
		else if(phonenumber.length()== 0){
			System.out.println("Phone number is empty.");
			message = "phone number is empty.";
		}
		else if(!confirmpassword.equals(password)){
			System.out.println("confirmpassword is not matched with password.");
			message = "confirmpassword is not matched with password.";
		}
		else{
			student.setStudentID(netID);
			student.setSex(sex);
			student.setFirstName(firstname);
			student.setLastName(lastname);
			student.setDOB(dob);
			student.setEmail(password);
			student.setPhoneNumber(phonenumber);
			student.setPassword(password);
			studentServiceImpl.addNewStudent(student);
			
			httpSession.setAttribute("student", student);
			System.out.println("student is added.");
			message = "student is added.";
		}
		
		request.setAttribute("message", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/student/index.jsp");
		dispatcher.forward(request, response);
		
	}
}