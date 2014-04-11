<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course List Page</title>
<link media="all" rel="stylesheet" type="text/css" href="css/course.css">
<link rel="shortcut icon" href="..\img\icon.ico" >
<link rel="icon" type="image/gif" href="..\img\icon.gif" >
<script type="text/javascript">
function swap(targetId){
  if (document.getElementById){
        target = document.getElementById(targetId);
            if (target.style.display == "none"){
                target.style.display = "";
            } else{
            	
                target.style.display = "none";
            }
                
  }
}
</script>
</head>
<body>
<div id="page">
<div id="wrapper">
		<div id="header">
			<div id="title">
			<h1> OLS Open Courses</h1>
			</div>
		</div>
		<div id="content">
		<div id="courseList">
				<div id="headline"><h3>Course List:</h3>
				</div>
				.......................................................................................................
				<div id="droplist">
		        <ul>
		        	<li>
		                <a href="#" onclick="swap('c1');return false;">Probability & Statistic</a>
		                <ul  id="c1" style="display: none;">
		                  <div id="dropbox">
		                  <strong>Probability & Statistics</strong><a heref=#>[Enter Course]</a>    </br> 
		                  <strong>Overview:</strong></br>
This course introduces students to the basic concepts and logic of statistical reasoning and gives the students introductory-level practical ability to choose, generate, and properly interpret appropriate descriptive and inferential methods. In addition, the course helps...
<a href=#>See course details >>></a>
						</div>
		                </ul>
		            </li>
		            <li>
		                <a href="#" onclick="swap('c2');return false;">Discrete Math</a>
		                <ul  id="c2" style="display: none;">
		                  <div id="dropbox"><p>asdasdasd
		                  asdasdasda
		                  asdasdasdasdasdasd
		                  as
		                  das
		                  da
		                  sda
		                  sd</p></div>
		                </ul>
		            </li>
		            <li>
		                <a href="#" onclick="swap('c3');return false;">Data Mining</a>
		                <ul id="c3" style="display: none;">
		                  <div id="dropbox"><p>asdasdasdassssssssssssssssssssssssssssssssd
		                  asdasdasdasaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad
		                  asdasdasdasdasdasdasssssssssssssssssssssssss
		                  as
		                  das
		                  da
		                  sda
		                  sd</p></div>
		                </ul>
		            </li>
		            <li>
		                <a href="#" onclick="swap('c4');return false;">Click</a>
		                <ul id="c4" style="display: none;">
		                  <div id="dropbox"><p>asdasdasd
		                  asdasdasda
		                  asdasdasdasdasdasd
		                  as
		                  das
		                  da
		                  sda
		                  sd</p></div>
		                </ul>
		            </li>
		        </ul>
		    </div>
		</div>
		</div>
</div>
</div>
</body>
</html>