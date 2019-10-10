package com.ust.springmvc.Dao;

import java.util.List;

import com.ust.springmvc.dto.Employee;

public interface EmployeeDao {
	public Employee auth(String email,String pass);
	public boolean registerEmployee(Employee employee);
	public boolean deleteEmployee(int id);
	public boolean updateEmployee(Employee employee);
	public List<Employee> getAllEmployee();
}
