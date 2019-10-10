package com.ust.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.springmvc.dto.Employee;
import com.ust.springmvc.service.EmployeeService;
 
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {                                 //For Date
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
 
	//@RequestMapping(path="/login1",method = RequestMethod.GET)
	@GetMapping("/login1")
	public String login1Page() {
		                                                 //for view page
		return "login1";
	}
	
	@GetMapping("/register1")                       //same as @RequestMapping(path="/login1",method = RequestMethod.GET)
	public String register1Page() {                  //for view page
		return  "register1";
	}
	
	
	@PostMapping("/login1")                                      //Over riding with doPost method
	public String login1(String email,String password,ModelMap map,HttpServletRequest request) {        //for posting the data
		
		Employee employee = service.auth(email, password);
		if(employee==null) {
			map.addAttribute("msg", "invalid user id password");
			return "login1";
		}
		request.getSession().setAttribute("emp", employee);;
		return "home1";
	}
	
	@PostMapping("/register1")                                  //Over riding with doPost method
	public String register1(Employee employee,ModelMap map) {    //for posting the data
		                                                     
		
		if(service.registerEmployee(employee)) {
			map.addAttribute("msg", "Registered employee successfully");
		}
		else {
			map.addAttribute("msg", "Invalid Data");
		}
		return "login1";
	
	}
	
	@GetMapping("/home1")                                    //for view page
	public String home1(HttpServletRequest req) {
		if(req.getSession(false)==null)
			return "login1";
		
		return "home1";
	}
	
	@GetMapping("/update")                                    //for view page
	public String updatePage() {
		return "update";
	}
	
	@PostMapping("/update")                                 //for posting data
	public String update(HttpSession session,Employee employee,@SessionAttribute("emp")Employee emp,ModelMap map) {
		
		employee.setEmail(emp.getEmail());
		if(service.updateEmployee(employee)) {
			map.addAttribute("msg", "updated the profile");
			session.setAttribute("emp",employee);
		}
		else {
			map.addAttribute("msg", "invlaid Data");
		}
		
		return "home1";
	}
	
	@GetMapping("/show-all")                               //for view page
	public String showAll(ModelMap map) {
		List<Employee> employees =service.getAllEmployee();
		map.addAttribute("list", employees);
		return "show-all";
	}
	
    @GetMapping("/delete")
	public String delete(@RequestParam("id")int id,ModelMap map) {            //@RequestParam("id")int id to get id from url
    	service.deleteEmployee(id);
    	map.addAttribute("msg", "Profile deleted");
    		
		return "redirect:./login1";
	}
    
    
    @GetMapping("/logout")
   	public String logout(HttpSession session,ModelMap map) {
   		session.invalidate();
    	map.addAttribute("msg", "Logout Successful");
   		return "login1";
   	}
	
}











