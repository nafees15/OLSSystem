	
<%@page import="com.ols.po.*" %>
<%Teacher teacher=(Teacher)session.getAttribute("teacher");



%>
	<form action="addCourseAction" method=""></form>	
		<table>
			<tr>
			<td>Teachcer ID:</td><td><input bgcolor="#edf7e8" type="text" name="TeacherID" size=25 value="<%=teacher.getTeacherID()%>" ></td>			
			</tr>
			<tr>
			<td>Course Id:</td><td><input bgcolor="#edf7e8" type="text" name="CourseID" size=25></td>
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
   </form>