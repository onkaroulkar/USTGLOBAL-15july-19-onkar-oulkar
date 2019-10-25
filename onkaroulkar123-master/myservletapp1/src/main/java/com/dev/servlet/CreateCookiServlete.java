package com.dev.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createcooki")
public class CreateCookiServlete extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	Cookie cookie = new Cookie("name", "bhai");
    	//super.doGet(req, resp);
    	
    	resp.addCookie(cookie);
    	    
    	resp.setContentType("text/html");
    	PrintWriter printWriter = resp.getWriter();
    	
    	printWriter.println("<h1>cookies are added "+"</h1>");
    	
    }


}
