package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		//create new student object
		Student student = new Student();
		//add student to the model
		model.addAttribute("student", student);
		//return jsp file
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		//log the input data
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		return "student-confirmation";
	}
	
}
