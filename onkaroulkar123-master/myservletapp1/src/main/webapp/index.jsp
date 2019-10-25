<%@page import ="java.util.Date" %>
<%!public void jspInit() {

		System.out.println("Init");

	}

	public void jspDestroy() {
		System.out.println("Destroy");
	}%>
<% int count= 0 ;%>
<% Date date = new Date();%>
<html>
<body>
	<h2>Hello World!</h2>
	<h2>count value =<%=count%></h2>
	<h2>current date and time :</h2>
	<h2><%=date%></h2>
</body>
</html>
