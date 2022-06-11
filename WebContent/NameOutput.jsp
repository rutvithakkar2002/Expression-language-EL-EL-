<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name Output</title>
</head>
<body>


	<%
		String Name = (String) request.getAttribute("MyName");
	%>

	<%=Name%>

	<br> using Expression Language : ${MyName}
	<br> 
	Addition of 3+4 is ${3+4}
	<br>
	 Division is ${4 div 2}
	<br> 
	Condition check: ${5>=5}

</body>
</html>