package com.ust.springrest.service;

import java.util.List;

import com.ust.springrest.dto.Employee;

public interface EmployeeService {

	public Employee auth(String email,String pass);
	public boolean registerEmployee(Employee employee);
	public boolean deleteEmployee(int id);
	public boolean updateEmployee(Employee employee);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployee();
}
