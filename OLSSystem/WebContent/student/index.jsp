<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
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

//ArrayList<Course> courses = new ArrayList<Course>();
//courses = (ArrayList<Course>)request.getAttribute("courses");
String fname="--";
String lname="--";
if(student!=null){
fname=student.getFirstName();
lname=student.getLastName();
System.out.println(fname+lname);
}
%>
<div id="page">
<div id="wrapper">
		<div id="header">
			<div id="title">
			
			<div id="user_nav">
					<div id='nav'>
					<ul>
					   <li><span>[<%=fname%>,<%=lname%>]</span></li>
					   <li class='active'><a href='../index.jsp'><span>Home</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Course List</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Serch Course</span></a></li>
					   <li class='last'><a href='#'><span>Help</span></a></li>
					
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
				<tr>
				<tr><a href="quizlist.jsp">
				  <td><a href="quizlist.jsp">Mat108S2011</a></td>
				  <td>Math Reasearch</td></a>
				  <td> <a href="deletecourseaction${courseID} }"><img alt="as" src="..\img\delete.png"></a></td>
				  </tr>				
				</table></div>
			</div>
			<div id="right">
			
			</div>
		</div>
</div>
</div>
</body>
</html>