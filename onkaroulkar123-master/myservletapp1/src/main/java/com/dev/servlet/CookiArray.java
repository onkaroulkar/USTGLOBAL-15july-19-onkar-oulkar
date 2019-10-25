package com.dev.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookiArray")
public class CookiArray  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] cookies  = req.getCookies();

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.print("<head>");
		out.print("<body>");
		
		if(cookies!=null)
		{
			for(Cookie cookie: cookies)
			{
				out.print("<h3> cookie name :"+cookie.getName() + "</h3>");
				out.print("<h3> cookie value :"+cookie.getValue() + "</h3>");
			}
		}
		else
		{
			out.print("cookies are not present");
		}
		out.print("</head>");
		out.print("</body>");
		
		//super.doGet(req, resp);
	}//end of doGet
	
}//end of class
