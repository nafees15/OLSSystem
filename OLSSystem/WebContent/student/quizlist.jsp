<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quiz List</title>
<link media="all" rel="stylesheet" type="text/css" href="../css/userindex.css">
<link rel="shortcut icon" href="favicon.ico" >
<link rel="icon" type="image/gif" href="icon.gif" >

</head>
<body>
<div id="page">
<div id="wrapper">
		<div id="header">
			<div id="title">
			
			<div id="user_nav">
					<div id='nav'>
					<ul>
					   <li><span>[Mat108S2011]>></span></li>
					   <li class='active'><a href='#'><span>Home</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Course List</span></a></li>
					   <li class='active'><a href='index.jsp'><span>Serch Quiz</span></a></li>
					   <li class='last'><a href='#'><span>Help</span></a></li>
					
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
				<tr>
				
				<tr>
				  <td><a href="quizpage.jsp">MTQ001</a></td>
				  <td>Quiz1</td>				  
				  <td>30</td>
				  <td>03/21/2014 23:59</td>
				  <td>Finished</td>
				  </tr>
				
				<tr>
				  <td><a href="quizlist.jsp">MTQ002</a></td>
				  <td>Quiz2</td>				  
				  <td>32</td>
				  <td>03/23/2014 23:59</td>
				  <td>Finished</td>
				  </tr>
				<tr>
				  <td><a href="quizlist.jsp">MTQ003</a></td>
				  <td>Quiz3</td>				  
				  <td>35</td>
				  <td>03/29/2014 23:59</td>
				  <td>Late</td>
				  </tr>
				<tr>
				  <td><a href="quizlist.jsp">MTQ004</a></td>
				  <td>Quiz4</td>				  
				  <td>30</td>
				  <td>03/21/2014 23:59</td>
				  <td>Unfinished</td>
				  </tr>
				<tr>
				  <td><a href="quizlist.jsp">MTQ005</a></td>
				  <td>Mid-term Quiz</td>				  
				  <td>50</td>
				  <td>04/01/2014 10:00</td>
				  <td>Unfinished</td>
				  </tr>  				
				</table>
				</div>
			
			
			</div>
		</div>

</div>
</body>
</html>