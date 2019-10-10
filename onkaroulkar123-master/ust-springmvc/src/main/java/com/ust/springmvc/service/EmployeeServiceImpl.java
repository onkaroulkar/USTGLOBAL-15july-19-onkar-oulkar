package com.ust.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.springmvc.Dao.EmployeeDao;
import com.ust.springmvc.dto.Employee;

@Service                                //same as component
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee auth(String email, String pass) {

		return dao.auth(email, pass);
	}

	@Override
	public boolean registerEmployee(Employee employee) {
	
		if(employee.getName()==null ||employee.getEmail()==null || employee.getPassword()==null)
		 return false;
		
		return dao.registerEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int id) {

		return dao.deleteEmployee(id);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		if(employee.getName()==null ||employee.getEmail()==null || employee.getPassword()==null)
			 return false;
		
		return dao.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
	
		return dao.getAllEmployee();
	}

}
