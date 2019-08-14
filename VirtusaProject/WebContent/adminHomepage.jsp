<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table{
width:500px;
border-collapse:collapse;
}
</style>
</head>
<body>
<body>

<table border="1" bordercolor="blue">
<tr>
<td>Name</td>
<td>Email</td>
<td>Father Name</td>
<td>Mother Name</td>
<td>High School Percentage</td>
<td>Higher Secondary Percentage</td>
<td>B.Tech Percentage/CGPA</td>
<td>Experience(years)</td>
<td>Skills</td>
<td>Reference ID</td>
<td>Job</td>
<td>Ratings</td>
<td>Status</td>

</tr>
<% String name=request.getAttribute("name").toString();%>
<% String email=request.getAttribute("email").toString();%>
<% String father=request.getAttribute("father").toString();%>
<% String mother=request.getAttribute("mother").toString();%>
<% String high=request.getAttribute("high").toString();%>
<% String higher=request.getAttribute("higher").toString();%>
<% String btech=request.getAttribute("btech").toString();%>
<% String years=request.getAttribute("years").toString();%>
<% String skills=request.getAttribute("skills").toString();%>
<% String refid=request.getAttribute("refid").toString();%>
<% String job=request.getAttribute("job").toString();%>


<tr>

<td><%=name %></td>
<td><%=email %></td>
<td><%=father %></td>
<td><%=mother%></td>
<td><%=high%></td>
<td><%=higher%></td>
<td><%=btech%></td>
<td><%=years%></td>
<td><%=skills %></td>
<td><%=refid %></td>
<td><%=job %></td>
<td><input type="number" name="ratings" min="1" max="10"></td>
<td>
<input type="radio" name="status">Selected
<input type="radio" name="status">Rejected
</td>
</tr>

</table>

</body>
</html>