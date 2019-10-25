package com.dev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.mywebapp.dao.EmployeeDao;
import com.dev.mywebapp.dao.EmployeedaoJpaImp;
import com.dev.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	EmployeeDao dao = new  EmployeedaoJpaImp();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//get the form data
		String empIdVal=req.getParameter("empId");
		String password=req.getParameter("password");
		int empId = Integer.parseInt(empIdVal) ;
		
		EmployeeInfoBean employeeInfoBean =dao.login(empId, password);

	}//end of dopost
}//end of class
