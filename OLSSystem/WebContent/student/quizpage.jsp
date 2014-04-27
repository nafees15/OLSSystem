<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.util.*"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Quiz List</title>
<link media="all" rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userindex.css">
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
<% HashMap<String,String> questionList=(HashMap<String,String>)session.getAttribute("questionList");%>
<div id="page">
<div id="wrapper">
		<div id="header">
			<div id="title">
			<h1>[Quiz1] <div id="leftTime"> </div></h1>
  
 			</div>
		
		</div>
		<div id="content">
		
				<%				
				int index=1;			
				List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(questionList.entrySet());		      
		        Collections.shuffle(list);
		        for (Map.Entry<String, String> entry : list) {
		            out.print(index+ "" + entry.getValue());
		            index++;
		        }
				%>
			
			
			</div>
		</div>

</div>
</body>
</html>