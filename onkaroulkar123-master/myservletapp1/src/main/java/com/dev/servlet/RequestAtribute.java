package com.dev.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/requestAtribute")
public class RequestAtribute extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) req.getAttribute("employee");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("</body>");

		out.println("<h3>Employee detailes </h3>");
		out.println("id : " + employeeInfoBean.getId()+"</br>");
		out.println("name : " + employeeInfoBean.getName()+"</br>");
		out.println("sallary :" + employeeInfoBean.getSallary()+"</br>");
		out.println("age : " + employeeInfoBean.getAge()+"</br>");
		out.println("designation :" + employeeInfoBean.getDesignation());

		out.println("<html>");
		out.println("</body>");

	}// end of do get

}// end of class
