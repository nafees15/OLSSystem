<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@page import="com.ols.po.*" %>
 <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher</title>
<link media="all" rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userindex.css">
<link rel="shortcut icon" href="favicon.ico" >
<link rel="icon" type="image/gif" href="icon.gif" >
<script type="text/javascript">
function loadXMLDoc(filename,divename)
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

function editCourse(filename)
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
			document.getElementById("edit_course").innerHTML=xmlhttp.responseText;
		
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
courses = (ArrayList<Course>)session.getAttribute("courses");

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
					   <li class='active'><a href='index.jsp'><span>Search Course</span></a></li>
					   <li class='last'><a href='#'><span>Help</span></a></li>
					   <div id="normala"><h3><%out.print("["+teacher.getFirstName()+","+teacher.getLastName()+"]"); %>
					   <a href="logoutaction">&nbsp;&nbsp;&nbsp;<img alt="as" src="${pageContext.request.contextPath}\img\logout.png">Logout&nbsp;&nbsp;&nbsp;</a></h3>
					</div>
					</ul>
					</div>
			</div>
		</div>
		</div>
		
		<div id="content">
			<div id="left">
				<div id="edit">
			 		<button id="button" onclick="loadXMLDoc('${pageContext.request.contextPath}/teacher/addCourseTable.jsp')"><img alt="as" src="${pageContext.request.contextPath}\img\add.png">Add Course</button>
			 		<button id="button" onclick="loadXMLDoc('${pageContext.request.contextPath}/teacher/requestOpenCourseTable.jsp')">Request Open Course</button>
			 		<div id="edit_div"> </div>
			    </div>
			    <div id="course_list">
				<table id="c_table">
				<tr>
				  <th width=15%>Course ID</th>
				  <th width=65%>Course Name</th>		
				  <th width=20%>Edit</th>
				  </tr>
				
				<c:forEach items="${sessionScope['courses']}" var="Course">
                <tr>
                    <td><a href="courseMainAction?courseID=${Course.courseID}"><c:out value="${Course.courseID}" /></a></td>
                    <td><c:out value="${Course.courseName}" /></td>
                    <td><a href="editCourse?courseID=${Course.courseID}"><img alt="as" src="${pageContext.request.contextPath}\img\edit.png"></a> <a href="deleteCourse?courseID=${Course.courseID}"><img alt="as" src="${pageContext.request.contextPath}\img\delete.png"></a></td>
                    
                </tr>
            	</c:forEach>			
				</table>
				</div>
				<div id="edit_course"> </div>
			</div>
			<div id="right">
			
			</div>
		</div>

</div>
</div>
</body>
</html>