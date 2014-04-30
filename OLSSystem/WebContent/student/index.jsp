<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@page import="com.ols.po.*" %>
 <%@ page import="java.util.*" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Main Page</title>
<link media="all" rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userindex.css">
<link rel="shortcut icon" href="favicon.ico" >
<link rel="icon" type="image/gif" href="icon.gif" >
<script type="text/javascript">

</script>
</head>
<body>
<%
Student student=(Student)session.getAttribute("student");

ArrayList<Course> courses = new ArrayList<Course>();
courses = (ArrayList<Course>)session.getAttribute("courses");
System.out.println("asdasd"+courses.get(0).getCourseName());

%>
<div id="page">
<div id="wrapper">
		<div id="header">
			<div id="title">
			
			<div id="user_nav">
					<div id='nav'>
					<ul>					   
					   <li class='active'><a href='../index.jsp'><span>Home</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Course List</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Serch Course</span></a></li>
					   <li class='last'><a href='#'><span>Help</span></a></li>
					<div id="normala"><h3><%out.print("["+student.getFirstName()+","+student.getLastName()+"]"); %><a href="logoutaction">&nbsp;&nbsp;&nbsp; <img alt="as" src="${pageContext.request.contextPath}\img\logout.png">Logout&nbsp;&nbsp;&nbsp;</a></h3>
					</div>
					</ul>
					</div>
			</div>
		</div>
		<div id="content">
			<div id="left">
			<div id="coursel_ist"> 
				<table id="c_table">
				<tr>
				  <th>Course ID</th>
				  <th>Course Name</th>		
				  <th>Edit</th>
				  </tr>
				
				<c:forEach items="${sessionScope['courses']}" var="Course">
                <tr>
                    <td><a href="stuCourseMainAction?courseID=${Course.courseID}"><c:out value="${Course.courseID}" /></a></td>
                    <td><c:out value="${Course.courseName}" /></td>
                    <td><a href="editCourse?courseID=${Course.courseID}"><img alt="as" src="${pageContext.request.contextPath}\img\edit.png"></a> <a href="deleteCourse?courseID=${Course.courseID}"><img alt="as" src="${pageContext.request.contextPath}\img\delete.png"></a></td>
                    
                </tr>
                </c:forEach>			
				</table></div>
			</div>
			<div id="right">
			<div id="right-coulmn">
			<h1>Announcement</h1> 
				    <li>Announcement1</li>
				    <li>Announcement</li>
				    <li>Announcement</li>
				    <li>Announcement</li>
				    <li>Announcement</li>
			</div>
			</div>
		</div>
</div>
</div>
</body>
</html>