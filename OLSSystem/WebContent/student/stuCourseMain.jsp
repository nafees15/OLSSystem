<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.ols.po.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quiz List</title>
<link media="all" rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userindex.css">
<link rel="shortcut icon" href="favicon.ico" >
<link rel="icon" type="image/gif" href="icon.gif" >

</head>
<body>

<%
Course course=(Course)request.getAttribute("course");
String courseID=course.getCourseID();

ArrayList<Quiz> quizList=new ArrayList<Quiz>();
quizList=(ArrayList<Quiz>)session.getAttribute("quizList");

System.out.println(quizList.get(1).getQuizID());
%>
<div id="page">
<div id="wrapper">
		<div id="header">
			<div id="title">
			
			<div id="user_nav">
					<div id='nav'>
					<ul>					   
					   <li class='active'><a href='#'><span>Home</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Course List</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Serch Quiz</span></a></li>
					   <li class='last'><a href='#'><span>Help</span></a></li>
					 <div id="normala"><h3><%out.print("["+course.getCourseID()+"]"); %></h3><a href="logoutaction">&nbsp;&nbsp;&nbsp;<img alt="as" src="${pageContext.request.contextPath}\img\logout.png">Logout&nbsp;&nbsp;&nbsp;</a>
					</div>
					</ul>
					</div>
			</div>
		</div>
		</div>
		<div id="content">
			
				<div id="edit">
			 		
			 		<div id="edit_div"> </div>
			    </div>
			    <div id="course_list">
				<table id="c_table">
				<tr>
				  <th width=20>Quiz ID</a></th>
				  <th width=50>Quiz Name</th>
				  <th width=30>Question No.</th>		
				  <th width=60>Due Date</th>
				  <th width=15>Status</th>
				  </tr>
				<c:forEach items="${sessionScope['quizList']}" var="Quiz">
                <tr>
                
                    <td><a href="stuQuizMainAction?quizID=${Quiz.quizID}"><c:out value="${Quiz.quizID}" /></a></td>
                    <td><c:out value="${Quiz.quizName}" /></td>
                    <td><c:out value="${Quiz.totalQuestionNumber}" /></td>
                    <td><c:out value="${Quiz.dueTime}" /></td>
                    <td>Unfinished</td>
                    
                </tr>
            	</c:forEach>
				 				
				</table>
				</div>
			
			
			</div>
		</div>

</div>
</body>
</html>