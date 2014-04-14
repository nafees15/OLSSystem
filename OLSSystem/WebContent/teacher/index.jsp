<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="com.ols.po.*" %>
 <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher</title>
<link media="all" rel="stylesheet" type="text/css" href="../css/userindex.css">
<link rel="shortcut icon" href="favicon.ico" >
<link rel="icon" type="image/gif" href="icon.gif" >
<script type="text/javascript">
function loadXMLDoc(filename)
{ 
	var xmlhttp;
	if(window.XMLHttpRequest)
	  {// code for IE7+, Firefox, Chrome, Opera, Safari   
		xmlhttp=new XMLHttpRequest(); 
		}
	else
	 {// code for IE6, IE5 
	  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	  } 
	xmlhttp.onreadystatechange=function(){ 
	  if(xmlhttp.readyState==4 && xmlhttp.status==200){
		document.getElementById("edit_div").innerHTML=xmlhttp.responseText;
      		}
	}
xmlhttp.open("GET",filename,true);
xmlhttp.send();
}

</script>
</head>
<body>
<%
Teacher teacher=(Teacher)session.getAttribute("teacher");

ArrayList<Course> courses = new ArrayList<Course>();
courses = (ArrayList<Course>)request.getAttribute("courses");

%>
<div id="page">
<div id="wrapper">
		<div id="header">
			<div id="title">
			
			<div id="user_nav">
					<div id='nav'>
					<ul>
					   <li><span><%out.print(teacher.getFirstName()+","+teacher.getLastName()); %></span></li>
					   <li class='active'><a href='../index.jsp'><span>Home</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Course List</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Serch Course</span></a></li>
					   <li class='last'><a href='#'><span>Help</span></a></li>
					
					</ul>
					</div>
			</div>
		</div>
		</div>
		
		<div id="content">
			<div id="left">
				<div id="edit">
			 		<button id="button"  onclick="loadXMLDoc('addCourseTable.jsp')">+Add Course</button>
			 		<button id="button" onclick="loadXMLDoc('requestOpenCourseTable.jsp')">Request Open Course</button>
			 		<div id="edit_div"> </div>
			    </div>
			    <div id="course_list">
				<table id="c_table">
				<tr>
				  <th width=15%>Course ID</th>
				  <th width=65%>Course Name</th>		
				  <th width=20%>Edit</th>
				  </tr>
				<tr>
				<c:forEach items="${requestScope['courses']}" var="Course">
                <tr>
                    <td><c:out value="${Course.courseID}" /></td>
                    <td><c:out value="${Course.courseName}" /></td>
                    <td><a href="editCourse?courseID=${Course.courseID}"><img alt="as" src="..\img\edit.png"></a> <a href="deleteCourse?courseID=${Course.courseID}"><img alt="as" src="..\img\delete.png"></a></td>
                    
                </tr>
            	</c:forEach>			
				</table>
				</div>
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