<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
a{
text-decoration:none;}
#job1{
margin-top:30px;
text-decoration:none;
}
img{
width:300px;
height:100px;
}
span{
margin-left:500px;
}

</style>
</head>
<body>
<img src="logo2.jpg">
<form action="status.jsp">
<input type="submit" value="Status"></form>
<hr>
<div id="job1"><a href="">Software Engineer</a>

<form action="details.jsp?role=Software Engineer"><span><input type="submit" value="Apply" ></span></form>
</div><br/>
<div id="job1"><a href="">Software Engineer</a>
<form action="details.jsp?Software Developer"><span><input type="submit" value="Apply" ></span></form>
</div><br/>
<div id="job1"><a href="">Software Engineer</a>
<form action="details.jsp"><span><input type="submit" value="Apply" name="Software Developer"></span></form>
</div><br/>
<div id="job1"><a href="">Software Engineer</a>
<form action="details.jsp"><span><input type="submit" value="Apply"></span></form>
</div><br/>
<div id="job1"><a href="">Software Engineer</a>
<form action="details.jsp"><span><input type="submit" value="Apply"></span></form>

</div><br/>

</body>
</html>