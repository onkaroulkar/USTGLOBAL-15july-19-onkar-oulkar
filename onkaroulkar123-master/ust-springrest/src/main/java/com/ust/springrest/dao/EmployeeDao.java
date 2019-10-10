package com.ust.springrest.dao;

import java.util.List;

import com.ust.springrest.dto.Employee;

public interface EmployeeDao {
	public Employee auth(String email,String pass);
	public boolean registerEmployee(Employee employee);
	public boolean deleteEmployee(int id);
	public boolean updateEmployee(Employee employee);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployee();
}
