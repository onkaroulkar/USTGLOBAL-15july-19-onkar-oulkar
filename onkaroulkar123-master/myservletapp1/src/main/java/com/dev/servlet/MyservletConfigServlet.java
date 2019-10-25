package com.dev.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyservletConfigServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		String nameVal = config.getInitParameter("name");
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h3> name value in config "+nameVal+"</h3>");
		out.println("</html>");
		out.println("</body>");
		
		
	}//end of do get

}//end of class
