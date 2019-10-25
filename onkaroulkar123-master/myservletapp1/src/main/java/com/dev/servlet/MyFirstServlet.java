package com.dev.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {

	
	public MyFirstServlet() {
		
		System.out.println("instatntiation");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		
		Date date = new Date();
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		
		out.println("<body>");
		out.println("<h1> this is first java servlet program<br/>");
		out.println("</h1>");
		out.println("<h2>current system date and time <br/>");
		out.println(date);
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");

		// super.doGet(req, resp);
	}
	
//	@Override
//	public void init() throws ServletException {
//		System.out.println("init");
//	}
//	
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("service");
//	}
//	@Override
//	public void destroy() {
//		System.out.println("destroy");
//	}

	
}
