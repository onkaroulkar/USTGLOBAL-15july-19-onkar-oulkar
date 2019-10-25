
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean id="emp" class="com.dev.mywebapp.dto.EmployeeInfoBean"
	scope="application"></jsp:useBean>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><%=emp.getName()%></h1>
	<h1><%=emp.getAge()%></h1>
</body>
</html>
<%@ include file="index.jsp"%>
