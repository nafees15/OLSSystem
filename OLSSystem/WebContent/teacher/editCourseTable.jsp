<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.ols.po.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quiz List</title>
<link media="all" rel="stylesheet" type="text/css" href="../css/userindex.css">
<link rel="shortcut icon" href="favicon.ico" >
<link rel="icon" type="image/gif" href="icon.gif" >
</head>
<%Course course=(Course)request.getAttribute("course");

%>
<body>
<div id="page">
<div id="wrapper">
		<div id="header">
			<div id="title">
			
			<div id="user_nav">
					<div id='nav'>
					<ul>
					   <li><span>[Quiz1]>></span></li>
					   <li class='active'><a href='../index.jsp'><span>Home</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Quiz List</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Serch Quiz</span></a></li>
					   <li class='last'><a href='#'><span>Help</span></a></li>
					
					</ul>
					</div>
			</div>
		</div>
		</div>
		<div id="content">
			<form action="submitEditCourse" method="post">	
		<table>
			
			<tr>
			<td>Course Id:</td><td><input bgcolor="#edf7e8" type="text" name="CourseID" size=25 readonly="readonly" value="<%=course.getCourseID()%>"></td>
			</tr>
			<tr>
			<td>Course Name:</td><td><input bgcolor="#edf7e8" type="text" name="CourseName" size=25 value="<%=course.getCourseName()%>"></td>
			</tr>
			<tr>
			<td>Course Credit:</td><td><input bgcolor="#edf7e8" type="text" name="Credit" size=5 value="<%=course.getCredit()%>"></td>
			</tr>
			<tr>
			<td>Course Type:</td><td><select name="State">
							  <option value="open">open</option>
							  <option value="inside">inside</option>							  
									</select></td>
			</tr>
			<tr><td>Opening Sem.:</td><td><select name="OpenSemester">
							  <option value="2014summer">2014 Summer</option>
							  <option value="2014fall">2014 Fall</option>	
							  <option value="2015winter">2015 Winter</option>	
							  <option value="2015spring">2015 Spring</option>					  
									</select></td>
			</tr>
			<tr>
			<td>Discription:</td><td><textarea rows="6" cols="70" name="Description"><%=course.getDescription()%></textarea></td></tr>
			<tr><td colspan="2" align="right" ><input value="Submit" type="submit" ></td></tr>			
			</table>
  </form>
			    </div>
			   
			
			
			</div>
		</div>

</div>
</body>
</html>