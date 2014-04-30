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

<title>Quiz Page</title>
<link media="all" rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userindex.css">
<link rel="shortcut icon" href="favicon.ico" >
<link rel="icon" type="image/gif" href="icon.gif" >


<script  language= "Javascript"> 

document.onkeydown = function (e) {
	var ev = window.event || e;
	var code = ev.keyCode || ev.which;
	if (code == 116) {
		if(ev.preventDefault) {
			ev.preventDefault();
		} else {
			ev.keyCode = 0;
			ev.returnValue = false;
		}
	}
}


    
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
<body onkeydown="onKeyDown()">
<script  language= "Javascript"> 

function KeyDown(event){  
    
    event= event ? event : (window.event ? window.event : null);// ie firefox都可以使用的事件
  
    if (event.keyCode==116){ //屏蔽 F5 刷新键  
        alert("禁止F5刷新网页！");  
        event.keyCode=0;  
        event.returnValue=false;  
    }  
  
    if ((event.ctrlKey)&&(event.keyCode==82)){ //屏蔽 Ctrl+R  
        alert("禁止Ctrl+R刷新网页！");  
        event.returnValue=false;  
    }  
  
    if ((event.shiftKey)&&(event.keyCode==121)){ //屏蔽 shift+F10  
        alert("禁止shift+F10刷新网页！");  
        event.returnValue=false;  
    }  
} 
// disable mouse right button
function Click()
{
	alert("Forbidden to use Click Right Button!!! ");
    window.event.returnValue=false;
}
document.oncontextmenu=Click;


</script>
<% HashMap<String,String> questionList=(HashMap<String,String>)session.getAttribute("questionList");%>
<div id="page">
<div id="wrapper">
		<div id="header">
			<div id="title">
			<h1>[Quiz1] <div id="leftTime"> </div></h1>
  
 			</div>
		
		</div>
		<div id="content">
		<form action="submitQuizAction">
				<%				
				int index=1;			
				List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(questionList.entrySet());		      
		        Collections.shuffle(list);
		        for (Map.Entry<String, String> entry : list) {
		            out.print(index+ "" + entry.getValue());
		            index++;
		        }
				%>
			<input value="Submit" type="submit">
			</form>
			</div>
		</div>

</div>
</body>
</html>