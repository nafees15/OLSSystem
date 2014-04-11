<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<table>
			<tr>
			<td>Prof. Name:</td><td><input bgcolor="#edf7e8" type="text" name="ProfName" size=25></td>			
			</tr>
			<tr>
			<td>Course Id:</td><td><input bgcolor="#edf7e8" type="text" name="CourseId" size=25></td>
			</tr>
			<tr>
			<td>Course Name:</td><td><input bgcolor="#edf7e8" type="text" name="CourseName" size=25></td>
			</tr>
			<tr>
			<td>Course Type:</td><td><select>
							  <option value="open">open</option>
							  <option value="inside">inside</option>							  
									</select></td>
			</tr>
			<tr><td>Opening Sem.:</td><td><select>
							  <option value="2014summer">2014 Summer</option>
							  <option value="2014fall">2014 Fall</option>	
							  <option value="2015winter">2015 Winter</option>	
							  <option value="2015spring">2015 Spring</option>					  
									</select></td>
			</tr>
			<tr>
			<td>Discription:</td><td><textarea rows="6" cols="70"></textarea></td></tr>
			<tr><td colspan="2" align="right" ><input value="Submit" type="submit"></td></tr>
			
			</table>
</body>
</html>