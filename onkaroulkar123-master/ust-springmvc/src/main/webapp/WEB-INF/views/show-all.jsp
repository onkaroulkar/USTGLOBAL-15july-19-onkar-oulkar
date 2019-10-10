<%@page import="java.util.List"%>
<%@page import="com.ust.springmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
List<Employee> employees =(List)request.getAttribute("list");
Employee emp = (Employee)session.getAttribute("emp");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="right">
<span><a herf="./update">Update Profile</a></span>
<span><a herf="./delete?id=<%=emp.getId()%>">Delete Profile</a></span>
<span><a herf="./logout">Logout</a></span>
</div>
<div>
<a href="./home1">Home</a>
</div>

<table>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>DOB</th>
    <th>Email</th>
  </tr>
  
  <% for(Employee employee: employees) { %>
  <tr>
    <td><%=employee.getId()%></td>
    <td><%=employee.getName() %></td>
    <td><%=employee.getDob()%></td>
    <td><%=employee.getEmail() %></td>
  </tr>
  <% }%>
</table>

</body>
</html>