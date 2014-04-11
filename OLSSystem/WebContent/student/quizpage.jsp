<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Quiz List</title>
<link media="all" rel="stylesheet" type="text/css" href="../css/userindex.css">
<link rel="shortcut icon" href="favicon.ico" >
<link rel="icon" type="image/gif" href="icon.gif" >
<script>  
      
    var leftTime = <%=Integer.parseInt("3600")%>;  
      
    function showLeftTime(){  
        var leftMinutes = parseInt(leftTime/60);  
        var leftSeconds = parseInt(leftTime%60);  
          
        if(leftTime < 0){  
            clearInterval(timer);  
            document.location.href = document.location.href;  
            //document.getElementById('leftTime').innerHTML = '';  
              
        }else{  
            document.getElementById('leftTime').innerHTML =' Left: '+leftMinutes+'min '+leftSeconds+'sec';  
        }  
        leftTime--;  
    }  
    var timer = setInterval('showLeftTime()',1000);  
    
 </script> 
</head>
<body>
<div id="page">
<div id="wrapper">
		<div id="header">
			<div id="title">
			<h1>[Quiz1] <div id="leftTime"> </div></h1>
  
 			</div>
		
		</div>
		<div id="content">	
				
			
			
			</div>
		</div>

</div>
</body>
</html>