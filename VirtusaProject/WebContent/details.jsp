<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
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
	width:50%;
	padding:60px;
	border-radius:15px;
	margin: 0 auto;
	margin-top:100px;
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
	#years{
	 width:100px;
	}
	#hello{
	margin:0px;
	}
</style>
</head>
<body>
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
	<div id="hello"></div>
	
	<div id="errormsg"></div>
	<form name="form1" id="form" action="JobsAppliedServlet" method="post" onsubmit='return check()'>
	<b>Job:</b><br/>
	<input type="radio" value="Software Developer" name="job">Software Developer<br/>
	<input type="radio" value="Software Testing" name="job">Software Testing<br/>
	<input type="radio" value="Data Analyst" name="job">Data Analyst<br/>
	<input type="radio" value="Data Scientist" name="job">Data Scientist<br/>
	<br/>
<!-- 	<select name="job">
  <option value="Software Developer" >Software Developer</option>
  <option value="Data Analyst" >Data Analyst</option>
  <option value="Software Testing" >Software Testing</option>
  <option value="Data Scientist" >Data Scientist</option>
</select> <br/> -->
	<b>Personal Details:</b><br/><yubr/>
	Name: <input type="text" name="name" placeholder="Full Name"/><br>	
	Email: <input type="text" name="email" placeholder="Email"/><br>	
    Father's Name: <input type="text" name="fathername" placeholder="Father's name"/><br>
    Mother's Name: <input type="text" name="mothername" placeholder="Mothers name"/><br>
    <b>Educational Details:</b><br/><br/>
    High School Percentage/CGPA: <input type="text" name="high" /><br>
    Higher Secondary percentage/CGPA:<input type="text" name="higher"/><br>
    B.Tech CGPA<input type="text" name="btech" /><br>
    <b>Experience</b><br/><br/>
    Years:<div id="years"><input type="text" name="years"></div><br/>
    <b>Skills</b><br/><br/>
    <input type="checkbox" name="skills" value="Java">Java
    <input type="checkbox" name="skills" value="Python">Python
    <input type="checkbox" name="skills" value="PHP">PHP
    <input type="checkbox" name="skills" value=".net">.net
    <input type="checkbox" name="skills" value="Angular">Angular
    <input type="checkbox" name="skills" value="Cpp">Cpp<br/>
    
	<input type="submit" name="action" value="Apply for the job" onclick="myFunction()"/>
	<script>
	
	</script>
	</form> <br>

</body>
</html>
