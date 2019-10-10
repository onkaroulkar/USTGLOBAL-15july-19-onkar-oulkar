package com.ust.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.springrest.dto.Employee;
import com.ust.springrest.dto.EmployeeResponse;
import com.ust.springrest.service.EmployeeService;

@RestController
@Controller
@RequestMapping("/employee")
public class EmpController {
	
@Autowired
private EmployeeService service;
	
@GetMapping(path="/get",produces=MediaType.APPLICATION_JSON_VALUE)
public  EmployeeResponse getEmployee(@RequestParam("id")int id) {
	Employee employee = service.getEmployee(id);                               //return response (no views)
	EmployeeResponse response = new EmployeeResponse();
	if(employee==null) {
		response.setStatusCode(404);
		response.setMessage("failure");
		response.setDescription("Data not found");
	}else {
		response.setStatusCode(200);
		response.setMessage("success");
		response.setDescription("Data Added");
	}
   return response;
}
	
@PostMapping(path="/add",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
public EmployeeResponse registerEmployee(@RequestBody Employee employee) {                      // @RequestBody  convert json.xml to java body
	EmployeeResponse response = new EmployeeResponse();
	if (service.registerEmployee(employee)) {
		
		response.setStatusCode(200);
		response.setMessage("success");
		response.setDescription("Data Added");
	
	}else {
		response.setStatusCode(404);
		response.setMessage("failure");
		response.setDescription("Data not Added");
	}
	return response;
}

@PutMapping(path="/modify",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
public EmployeeResponse updateEmployee(@RequestBody Employee employee) {
	EmployeeResponse response = new EmployeeResponse();
	if(service.updateEmployee(employee)) {
		response.setStatusCode(200);
		response.setMessage("success");
		response.setDescription("Data updated");
	}else{
		response.setStatusCode(404);
		response.setMessage("failure");
		response.setDescription("Data not Added");
	}
	return response;
}

@DeleteMapping(path="/remove/id",produces=MediaType.APPLICATION_JSON_VALUE)
public EmployeeResponse deleteEmployee(int id) {
	EmployeeResponse response = new EmployeeResponse();
	if(service.deleteEmployee(id)) {
		response.setStatusCode(200);
		response.setMessage("success");
		response.setDescription("Data updated");
	}else {
		response.setStatusCode(404);
		response.setMessage("failure");
		response.setDescription("Data not removed");
	}
	return response;
}

@GetMapping(path="/get-all",produces=MediaType.APPLICATION_JSON_VALUE)
public List<Employee> getAllEmployee(){
	return service.getAllEmployee();
}

}
