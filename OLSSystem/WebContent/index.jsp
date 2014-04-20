<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Web Quiz System</title>
<link media="all" rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
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
		document.getElementById("signup").innerHTML=xmlhttp.responseText;
      		}
	}
xmlhttp.open("GET",filename,true);
xmlhttp.send();
}

function che(){
	tt = document.getElementById("signup");
	tt.style.display="block";
}
</script>
</head>
<body>
<%
String errorMessage=(String)request.getAttribute("ErrMsg");
if(errorMessage==null) errorMessage="";%>
<div id="page">
	<div id="wrapper">
	    <!--header -->
		<div id="header">
			<div class="holder">
				<div class="top-section">
					<h1 class="logo"><a href="#">UNIVERSITY AT ALBANY. State University of New York</a></h1>
					<p id="logo_p" align='right'>Online <strong>Learning</strong> System </p>
				</div>
				
				<div id='nav'>
					
					<ul>
					   <li class='active'><a href='index.jsp'><span>Home</span></a></li>
					   <li class='has-sub'><a href='#'><span>Learn With OLS</span></a>
					      <ul>
					         <li><a href='student'><span>My Course List</span></a></li>
					         <li><a href='#'><span>New Learner</span></a></li>
					         <li class='last'><a href='#'><span>Register For Course</span></a></li>
					      </ul>
					   </li>
					   <li class='has-sub'><a href='#'><span>Teach With OLS</span></a>
					      <ul>
					         <li><a href='teacher'><span>My Class List</span></a></li>
					         <li class='last'><a href='#'><span>Apply Class</span></a></li>
					      </ul>
					   </li>
					   <li class='last'><a href='#'><span>Help</span></a></li>
					
					</ul>
					
					</div>
				
			</div>
			
		
		</div>
		
		<!--main -->
		<div id="main">
			<div id="content">
				
				<div id="left-coulmn">
				    <div id="left_1"></div>
				    <h1>New Open Courses</h1> 
				    <img alt="as" src="img\new.png">PRINCIPLES OF COMPUTING [2014 Summer]</br>
				    <img alt="as" src="img\new.png">MEDIA PROGRAMMING       [2014 Summer]</br>
				    <img alt="as" src="img\new.png">RESPONSIBLE COMPUTING   [2014 Summer]</br>
				    <img alt="as" src="img\new.png">STATISTICAL REASONING   [2014 Summer]</br>
				    <img alt="as" src="img\new.png">PROBABLILITY&STATISTICS [2014 Summer]</br>
				    <img alt="as" src="img\new.png">ENGINEERING STATICS     [2014 Summer]</br>			    
				    
					<div id="left_2"></div>
					<h1>Calendar</h1> 
					<img alt="as" src="img\calendar.png">Open Course [2014-4-01]</br>
					<img alt="as" src="img\calendar.png">Dr. Smith's Lecture [2014-4-05]</br>
					<img alt="as" src="img\calendar.png">Lecture:Data Mining and Economic[2014-4-01]</br>
				</div>
				
				
				
				
				
				
				<div id="mid-coulmn">
				<div id="left_1">
				    <h1>Important News</h1> 
				    <img alt="as" src="img\alert.png">Discrete math exam due day Apr. 5</br>
				    <img alt="as" src="img\alert.png">Change your default password</br>
				    <img alt="as" src="img\alert.png">Announcement1</br>
				    <img alt="as" src="img\alert.png">Announcement1</br>
				    <img alt="as" src="img\alert.png">Announcement1</br>
				   </div> 
					<div id="left_2">
					<h1>Resources</h1> 
					<a href=#><span><img alt="as" src="img\source_ico.png">Discrete Math [free slides] </br></span></a>
					<a href=#><span><img alt="as" src="img\source_ico.png">Maven Concept [e-book]</br></span></a>
					<a href=#><span><img alt="as" src="img\source_ico.png">Algebra and Physics [e-book] </br></span></a>
					<a href=#><span><img alt="as" src="img\source_ico.png">Matlab Learning [Lecture Slides]</br></span></a>
					<a href=#><span><img alt="as" src="img\source_ico.png">CAD Material [e-book]</br></span></a>
					<a href=#><span><img alt="as" src="img\source_ico.png">Mathematical Thinking [e-book]</br></span></a>					
					</div>
				</div>
				<div id="right-coulmn">
				 <div id="login-form">

			        <h3>Login</h3>
			
			        <fieldset>
			
			            <form action="loginaction" method="post">
			            	<p style="color:red;"><%=errorMessage%></p>
			            	<input type="radio" id="stu" name="userType" value="student" checked><label for="stu">Student</label>
			            	<input type="radio" id="tea"name="userType" value="teacher"><label for="tea">Teacher</label>
			
			                <input type="text" required value="UserID" name="userID" onBlur="if(this.value=='')this.value='UserID'" onFocus="if(this.value=='UserID')this.value='' "> <!-- JS because of IE support; better: placeholder="NetID" -->
			
			                <input type="password" required value="Password" name="password" onBlur="if(this.value=='')this.value='Password'" onFocus="if(this.value=='Password')this.value='' "> <!-- JS because of IE support; better: placeholder="Password" -->
			
			                <input type="submit" value="Login">
			
			                <footer class="clearfix">
			
			                    <p><span class="info">?</span><a href="#">Forgot Password</a></p>			
			                </footer>			
			            </form>
			           <!-- <button id="button" onclick="loadXMLDoc('${pageContext.request.contextPath}/student/studentSignup.jsp')"><img alt="as" src="${pageContext.request.contextPath}\img\down_arrow.png">Sign UP</button></br></br></br>-->
						<button id="button" onclick="che()"><img alt="as" src="${pageContext.request.contextPath}\img\down_arrow.png">Sign UP</button></br></br></br>
						
						<div id="signup" style="display:none"> 
						<form action="signupaction" method="post">
									</br><label>NetID:*</label></br> 
									<input type="text" name="username" size="25" maxlength="16" /></br>
									<label>Sex:</label><select name="Sex">
									                   <option value="male">Male</option>
													   <option value="female">Female</option>							  
														</select></br> 
									<label>First Name:</label></br> 
									<input bgcolor="#edf7e8" type="text" name="CourseName" size=25>			
									<label>Last Name:</label></br> 
									<input bgcolor="#edf7e8" type="text" name="CourseName" size=25>	
									<label>DOB(MM-DD-YYYY):</label></br> 
									<input bgcolor="#edf7e8" type="text" name="dob" size=10>	
									<label>E-mail:*</label></br> 
									<input bgcolor="#edf7e8" type="text" name="email" size=10>
									<label>Phone Number:</label></br> 
									<input bgcolor="#edf7e8" type="text" name="phonenumber" size=10>
									<label>Password:*</label></br> 
									<input bgcolor="#edf7e8" type="text" name="password" size=10>
									<label>Confirm Password:*</label></br> 
									<input bgcolor="#edf7e8" type="text" name="confirmpassword" size=10>
									<input value="Sign UP" type="submit">			
									</form>
						</div>
			        </fieldset>

    				</div> <!-- end login-form -->
				</div>
			</div>
		
		</div>
		
	    <!--footer -->
	    <div id="footer" align='center'>
	   	    <img alt="as" src="icon.gif">
	    Designed by <strong>Stupid 5</strong>.
            <address>
      <strong>University at Albany</strong>, State University of New York · 1400 Washington Ave., </br>· Albany, NY 12222 · Phone (518) 442-3300
      </address>
           <span>&copy;&nbsp;2014 University at Albany</span> 
           </div>
  </div>
	    </div>
	



  
  </body>

</html>

