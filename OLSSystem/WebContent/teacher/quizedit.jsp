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
			
				<div id="edit">
			 		<button onclick="loadXMLDoc('MultiChoiceTable.jsp')">+Add Multi-Choice Quistion</button>
			 		<button onclick="loadXMLDoc('FillBlankTable.jsp')">+Add Fill-Blank Quistion</button>
			 		<div id="edit_div"> 
			 		</div>
			    </div>
			    <div id="course_list">
				<table id="c_table">
				<tr>
				  <th width=20>Subject ID</a></th>
				  <th width=50>Subject Content</th>
				  <th width=60>Question Type</th>
				  <th width=30>Answer</th>				  
				  <th width=15>Edit</th>
				  </tr>
				<tr>
				
				<tr>
				  <td>s1001</td>
				  <td>What sampling technique is being used in this scenario?</td>				  
				  <td>Multi-choice</td>
				  <td>B</td>
				  <td><a href=""><img alt="as" src="..\img\edit.png"></a> <a href=""><img alt="as" src="..\img\delete.png"></a></td>
				 </tr>
				
				<tr>
				  <td>s1002</td>
				  <td> Within each county, claims of 25 male and 25 female patients are randomly selected?</td>				  
				  <td>Multi-Choice</td>
				  <td>C</td>
				  <td><a href=""><img alt="as" src="..\img\edit.png"></a> <a href=""><img alt="as" src="..\img\delete.png"></a></td>
				 </tr>
				<tr>
				  <td>s1003</td>
				  <td>Examine each of the variables in the dataset as well as their descriptions above. Identify each</td>				  
				  <td>Fill-Blank</td>
				  <td>2,2,3</td>
				  <td><a href=""><img alt="as" src="..\img\edit.png"></a> <a href=""><img alt="as" src="..\img\delete.png"></a></td>
				 </tr>			
				</table>
				</div>
			
			
			</div>
		</div>

</div>
</body>
</html>