
<form action="signupaction" method="post">
</br><label>NetID:*</label></br> 
<input type="text" name="username" id='NetID' size="25" maxlength="16" onblur = "CheckUserName('NetID')" /></br>
<label>Sex:</label><select name="Sex">
							  <option value="male">Male</option>
							  <option value="female">Female</option>							  
									</select></br> 
<label>First Name:</label></br> 
<input bgcolor="#edf7e8" type="text" name="FirstName" size=25 onblur = "CheckUserName('NetID')">			
<label>Last Name:</label></br> 
<input bgcolor="#edf7e8" type="text" name="LastName" size=25>	
<label>DOB(MM-DD-YYYY):</label></br> 
<input bgcolor="#edf7e8" type="text" name="dob" size=10>	
<label>E-mail:*</label></br> 
<input bgcolor="#edf7e8" type="text" type="email" name="email" size=10>
<label>Phone Number:</label></br> 
<input bgcolor="#edf7e8" type="text" name="phonenumber" size=10>
<label>Password:*</label></br> 
<input bgcolor="#edf7e8" type="text" name="password" size=10>
<label>Confirm Password:*</label></br> 
<input bgcolor="#edf7e8" type="text" name="confirmpassword" size=10>
<input value="Sign UP" type="submit">			
</form>
<script type="text/javascript">
	function CheckUserName(str)
    { 
        var strReg=""; 
        var r; 
        var strText= document.getElementById(str).value;
        
        if(strText=="" || strText==null)
        {
            alert(type+" is can't be Empty!");
            return;
        }
    }
</script>