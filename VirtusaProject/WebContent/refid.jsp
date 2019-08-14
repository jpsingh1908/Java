<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<form action="homepage.jsp">
<%String count=request.getAttribute("count").toString(); %>
<h1><%="Your reference id is: "+count%></h1>
<input type="submit" value="Go to Homepage">
</form>
</body>
</html>