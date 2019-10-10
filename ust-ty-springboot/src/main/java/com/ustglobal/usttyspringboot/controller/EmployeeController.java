package com.ustglobal.usttyspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.usttyspringboot.dto.Employee;
import com.ustglobal.usttyspringboot.dto.EmployeeResponse;
import com.ustglobal.usttyspringboot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class EmployeeController {

	@Autowired
	@Qualifier("jpa")
	private EmployeeService service;

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {
		Employee employee = service.getEmployee(id);
		EmployeeResponse response = new EmployeeResponse();
		if (employee!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Found");
			response.setEmployeeList(Arrays.asList(employee));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data Found");
		}
		return response;
	}

	@GetMapping(path = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() {
		List<Employee> employeeList = service.getAllEmployee();
		EmployeeResponse response = new EmployeeResponse();
		if (employeeList.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employees Not Found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Found");
			response.setEmployeeList(employeeList);
		}
		return response;
	}

	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody Employee employee) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.addEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee data add Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee data add Unsuccessfully");
		}
		return response;
	}

	@PutMapping(path = "/modify", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody Employee employee) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.modifyEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee data modified Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee data modified Unsuccessfully");
		}
		return response;
	}

	@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse removeEmployee(@PathVariable("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.removeEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Removed Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee Removed Unsuccessfully");
		}
		return response;

	}
	
	@GetMapping(path = "/get-all-name", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(@RequestParam("name")String name) {
		List<Employee> employeeList = service.getEmployeesByName(name);
		EmployeeResponse response = new EmployeeResponse();
		if (employeeList!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Found");
			response.setEmployeeList(employeeList);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data Found");
		}
		return response;
	}
	
	@GetMapping("/exce")
	public String throwException() throws Exception {
		throw new Exception();
	}
}
