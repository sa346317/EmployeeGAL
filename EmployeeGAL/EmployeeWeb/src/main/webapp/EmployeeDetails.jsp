<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<h2>Employee Details</h2>
<%=request.getAttribute("EmployeeDetails")%>
<div style="text-align: right"><a href="Home.jsp">Back</a></div>
<div style="text-align: right"><a href="Logout">Logout</a></div>
</body>
</html>