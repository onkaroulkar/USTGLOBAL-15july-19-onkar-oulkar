package com.dev.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setAge(10);
		bean.setName("shubham");
		bean.setSallary(111111);
		bean.setDesignation("hr");
		bean.setId(100);
		
		req.setAttribute("employee", bean);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/requestAtribute");
		dispatcher.forward(req, resp);
		
	}// end of do get
}// end of class
