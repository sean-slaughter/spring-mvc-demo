package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//need a controller method to show the process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello-world";
	}
	
	//add a controller method to read form data
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest req, Model model) {
		//read request param from HTML form
		String theName = req.getParameter("studentName");
		//convert data to all caps
		theName = theName.toUpperCase();
		//create message
		String output = "Yo! " + theName;
		//add message to model
		model.addAttribute("message", output);
		
		return "hello-world";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {
		//read request param from HTML form
		String theName = name.toUpperCase();
		//create message
		String output = "Yo! " + theName;
		//add message to model
		model.addAttribute("message", output);
		
		return "hello-world";
	}
	
	
	
	
}
