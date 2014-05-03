<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link media="all" rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userindex.css">
<link rel="shortcut icon" href="favicon.ico" >
<link rel="icon" type="image/gif" href="icon.gif" >
</head>
<%
String errorMessage=(String)request.getAttribute("ErrMsg");
if(errorMessage==null) errorMessage="";%>
<body background="white">
<div id="login-form">

			        <h3>Administrator Login</h3>
			
			        <fieldset>
			
			            <form action="loginaction" method="post">
			            	<p style="color:red;"><%=errorMessage%></p>
			            	
			                <input type="text" required value="UserID" name="userID" onBlur="if(this.value=='')this.value='UserID'" onFocus="if(this.value=='UserID')this.value='' "> <!-- JS because of IE support; better: placeholder="NetID" -->
			
			                <input type="password" required value="Password" name="password" onBlur="if(this.value=='')this.value='Password'" onFocus="if(this.value=='Password')this.value='' "> <!-- JS because of IE support; better: placeholder="Password" -->
			
			                <input type="submit" value="Login">
			
			                <footer class="clearfix">
			
			                    <p><span class="info">?</span><a href="#">Forgot Password</a></p>			
			                </footer>			
			            </form>
			           						
			        </fieldset>

    				</div> 
</body>
</html>