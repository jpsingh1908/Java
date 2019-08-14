<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
	a{
		font-size: 30px;
	}
	a:link
	{ color:blue;}
	a:visited{
	color:green;
	}
	a:hover{
		text-decoration: underline;
		font:size:50px;
	}
	input[type="text"],input[type="password"]
,input[type="submit"]
{
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
	border-radius:15px;
}
#form
{
    border: 3px solid #f1f1f1;
	width:20%;
	padding:60px;
	border-radius:15px;
	margin: 0 auto;
	margin-top:200px;
}
#s:hover {
    opacity: 0.5;
	background-color:rgb(22, 100, 54);
}
	#errormsg
	{
		color:red;
		font-size:18px;
		text-align: center;
	}
</style>
</head>
<body> <!-- onload="alert('form loaded')" -->
	<script>
		function check()
		{
			email = form1.email.value;
			password = form1.password.value;
			if(email==""){ //alert('email cannot be empty');{
			document.getElementById("errormsg").innerHTML='email cannot empty';
			return false;
			}
			else if(password=="") //alert('password cannot be empty')
				{document.getElementById("errormsg").innerHTML='password cannot empty';
			return false;}
			return true;
		}
	</script>
	<div id="errormsg"></div>
	<form name="form1" id="form" action="signupServlet" method="get" onsubmit='return check()'>
	<input type="text" name="name" placeholder="Full name"/><br>	
	<input type="text" name="email" placeholder="Email"/><br>	
    <input type="password" name="password" placeholder="Password"/><br>
    <input type="password" name="cpassword" placeholder="Confirm Password"/><br>
	<input type="submit" name="action" value="Register"/>
	</form> <br>

</body>

</html>
