package com.dev.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/contextAtribute")
public class ContestAtributeServlete extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setAge(21);
		bean.setName("omibaba");
		bean.setSallary(100);
		bean.setDesignation("hr");
		bean.setId(200);
		
	   ServletContext context = getServletContext();
	   context.setAttribute("emp", bean);
	   
	   resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("</body>");

		out.println("<h3>Employee detailes </h3>");
		out.println("id : " + bean.getId()+"</br>");
		out.println("name : " + bean.getName()+"</br>");
		out.println("sallary :" + bean.getSallary()+"</br>");
		out.println("age : " + bean.getAge()+"</br>");
		out.println("designation :" + bean.getDesignation());

		out.println("<html>");
		out.println("</body>");
		
		
	}// end of do get
}// end of class
