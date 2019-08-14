<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table{
width:800px;
border-collapse:collapse;
}
input{
background-color:transparent;
border: 0px solid;
			   height: 20px;
			    width: 160px;
 			   color: #CCC;

}
</style>
</head>
<body>
<body>
<h1>HR</h1>
<table border="1" bordercolor="blue">
<tr>
<td>Name</td>
<td>Email</td>
<td>Experience(years)</td>
<td>Skills</td>
<td>Reference ID</td>
<td>Job</td>
<td>Comments</td>
<td>Status</td>

</tr>
<% String name=request.getAttribute("name").toString();%>
<% String email=request.getAttribute("email").toString();%>

<% String years=request.getAttribute("years").toString();%>
<% String skills=request.getAttribute("skills").toString();%>
<% String refid=request.getAttribute("refid").toString();%>
<% String job=request.getAttribute("job").toString();%>


<tr>
<td><%=name %></td>
<td><%=email %></td>
<td><%=years%></td>
<td><%=skills %></td>
<td><%=refid %></td>
<td><%=job %></td>
<td><input type="text" name="Comments"></td>
<td>
<input type="radio" name="status">Selected
<input type="radio" name="status">Rejected
</td>
</tr>

</table>


</body>
</html>