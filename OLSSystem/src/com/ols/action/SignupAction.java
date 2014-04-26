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
		
		if(netID == null){
			System.out.println("netId is empty.");
			netID = "";
		}
		if( sex == null){
			System.out.println("sex is empty.");
			sex = "";
		}
		if( firstname == null){
			System.out.println("first name is empty.");
			firstname = "";
		}
		if( lastname == null){
			System.out.println("last name is empty.");
			lastname = "";
		}
		if( dob == null){
			System.out.println("dob is empty.");			
			dob = "";
		}
		if( email == null){
			System.out.println("email is empty.");			
			email = "";
		}
		if( phonenumber == null){
			System.out.println("phone number is empty.");			
			phonenumber = "";
		}
		if( password == null ){
			System.out.println("password is empty");
			password = "";
		}
		if( confirmpassword == null){
			System.out.println(" confirmpassword is not matched with password.");
			confirmpassword = "";
		}
		
		Student student = new Student();
		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
		if( studentServiceImpl.getStudent(netID) != null){
			System.out.println("student already exists.");
			message = "student already exists.";
		}
		else if(sex.length() == 0){
			message = "sex is empty.";
		}
		else if(firstname.length() == 0){
			message = "first name is empty."; 
		}
		else if(lastname.length() == 0){
			message = "last name is empty."; 
		}
		else if(dob.length() == 0){
			message = "dob is empty.";
		}
		else if(email.length()== 0){
			message = "email is empty.";
		}
		else if(phonenumber.length()== 0){
			message = "phone number is empty.";
		}
		else if(!confirmpassword.equals(password)){
			message = "student already exists.";
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