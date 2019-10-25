package com.dev.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getEmp")
public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");

		if (empId == 100) {
			out.println("<h1> employee detail for emp :" + empId + "</h1>");
			out.println("id :100</br>");
			out.println("name : shuhbam </br>");
			out.println("age :55");
		} else {
			out.println("<h1>employee not found" + "</h1>");
		}

		out.println("</html>");
		out.println("</body>");

		// super.doGet(req, resp);
	}
}
