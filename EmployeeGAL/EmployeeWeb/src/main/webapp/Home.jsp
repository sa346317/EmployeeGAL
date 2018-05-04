<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home Page</title>
</head>
<body>
 <center><h2>Home Page</h2></center>
 	Login Success 
	<h3>Search Employee</h3>
	<form action="GALServlet" method="post">
	    <input type="text" placeholder="Enter Employee Id" name="userid" required>	        
	    <br/><br/><button type="submit">Get Employee</button>
</form> 
 <div style="text-align: right"><a href="Logout">Logout</a></div>
</body>
</html>