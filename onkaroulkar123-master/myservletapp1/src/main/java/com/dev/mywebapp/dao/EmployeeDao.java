package com.dev.mywebapp.dao;

import com.dev.mywebapp.dto.EmployeeInfoBean;

public interface EmployeeDao {
	
	public EmployeeInfoBean searchEmployee(int id);
	public EmployeeInfoBean login(int empId , String Password);

}
