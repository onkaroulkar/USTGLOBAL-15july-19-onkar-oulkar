<%@page import="com.ust.springmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<% 
  Employee employee = (Employee)session.getAttribute("emp");
%>

<body>

<div><a href="./home1">Home</a></div>
<div><a href="./logout">Logout</a></div>

<form action="./update" method="Post">
<table>
 
 <tr>
    <th>ID:</th>
    <th><input type="text" name="id" readonly="readonly" value="<%=employee.getId() %>"></th>
  </tr>
  <tr>
    <th>DOB:</th>
    <th><input type="date" name="dob"></th>
  </tr>
   <tr>
    <th>Name:</th>
    <th><input type="text" name="name" required value="<%=employee.getName() %>"></th>
  </tr>
  
   <tr>
    <th>Password:</th>
    <th><input type="password" name="password" required ></th>
  </tr>
  <tr><td><input type="submit"></td></tr>
</table>

</form>
</body>
</html>