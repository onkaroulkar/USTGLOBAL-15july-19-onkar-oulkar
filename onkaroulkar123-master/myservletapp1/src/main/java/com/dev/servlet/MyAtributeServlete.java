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

@WebServlet("/myatributevalue")
public class MyAtributeServlete extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext context = getServletContext();
		EmployeeInfoBean infoBean = (EmployeeInfoBean) context.getAttribute("emp");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("</body>");

		out.println("<h3>Employee detailes </h3>");
		out.println("id : " + infoBean.getId()+"</br>");
		out.println("name : " + infoBean.getName()+"</br>");
		out.println("sallary :" +infoBean.getSallary()+"</br>");
		out.println("age : " + infoBean.getAge()+"</br>");
		out.println("designation :" + infoBean.getDesignation());

		out.println("<html>");
		out.println("</body>");
		

	}// end of doget

}// end of class
