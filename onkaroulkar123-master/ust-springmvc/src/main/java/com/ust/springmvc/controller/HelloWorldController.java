package com.ust.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.springmvc.dto.Employee;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@InitBinder                                                                     //to use to have a custom editer it will be executed once per controller..............
	public void initBinder(WebDataBinder binder) {                                 //For Date
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@RequestMapping(path="/world",method = RequestMethod.GET)
	public String hello(ModelMap map) {

		map.addAttribute("msg", "Hello World");
		return "index";
	}

	//Query String Param
	@RequestMapping(path="/query",method = RequestMethod.GET)
	public String getInfo(@RequestParam("id")int id,@RequestParam("name")String name,ModelMap map) {

		map.addAttribute("id", id);
		map.addAttribute("name",name);

		return "info";
	}

	//Going to Form page
	@RequestMapping(path="/form-page",method=RequestMethod.GET)
	public String getForm() {

		return "form";
	}
	//Form data handling
	@RequestMapping(path="/form",method=RequestMethod.POST)
	public String formData(Employee emp,ModelMap map) {
		map.addAttribute("id", emp.getId());    //(ModelMap map)for display in web page
		map.addAttribute("name", emp.getName());
		map.addAttribute("dob", emp.getDob());
		map.addAttribute("email", emp.getEmail());
		map.addAttribute("password", emp.getPassword());
		return "info";   //return info.jsp
	}


	//Cookies.......
	@RequestMapping(path="/add-cookie",method=RequestMethod.GET)
	public String addCookies(HttpServletResponse resp,ModelMap map) {
		//Add Cookie..
		Cookie cookie = new Cookie("name","vikas");
		resp.addCookie(cookie);
		map.addAttribute("msg","cookie added to the browser");
		return "cookie";
	}

	//display Cookie on jsp
	@RequestMapping(path="/get-cookie",method=RequestMethod.GET)
	public String getCookie(@CookieValue(name="name",required=false)String name,ModelMap map) {     //@CookieValue(name="name",required=false)
		//  if cookie is present return cookie value
		// else return null;

		if(name==null) {
			map.addAttribute("msg","Cookie not present");
		}else {
			map.addAttribute("msg", "cookie value:"+name);
		}
		return "cookie";
	}

	//path para
	@RequestMapping(path="/path-para/{id}/{name}" ,method=RequestMethod.GET)                                      //http://localhost:8082/ust-springmvc/hello/path-para/prasad
	public String getPathVAlues(@PathVariable("name")String name,@PathVariable("id")String id,ModelMap map) {     //here we are sending value in url as a path (name="vikas")
		                                                                                                          //Vikas as a value
		map.addAttribute("name",name);
		map.addAttribute("id", id);
		return "info";
	}
	
	
	//Session
	@RequestMapping(path="/set-attribute",method=RequestMethod.GET)
	public String setSessionAttribute(HttpSession session,ModelMap map) {                                  //setSession(HttpSession session) Automatic session is created
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("vikas");
		emp.setEmail("prasadvikas0557");
		emp.setPassword("************");
		session.setAttribute("employee", emp);
		
		map.addAttribute("msg", "Session Attribute added");
		return "index";
	}
	
	@RequestMapping(path="/get-attribute",method=RequestMethod.GET)
	public String getSessionAttribute(@SessionAttribute(name="employee",required=false)Employee employee,ModelMap map) {        //@SessionAttribute(name="employee") it will automacilly get the session 
		 if(employee!=null) {                                                                                                        //and put in Employee employee (object)
		
//		System.out.println(employee.getName());
//		System.out.println(employee.getEmail());
//		System.out.println(employee.getId());
		
		map.addAttribute("msg", employee);
		 }
		 else {
			map.addAttribute("msg","no attribute present");
		 }
		return "index";
	}
	
	@RequestMapping(path="/forward",method = RequestMethod.GET)
	public String forward() {
		
		return "forward:add-cookie";                  //it will return to add-cookie it is same as forward in jsp...
		                                              
	}
	
	@RequestMapping(path="/redirect",method = RequestMethod.GET)
	public String redirect() {
		
		return "redirect:http://www.google.com";                  //it will return to add-cookie it is same as forward in jsp...
		                                              
	}
}
