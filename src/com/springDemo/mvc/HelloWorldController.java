package com.springDemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {

	// A controller method to show initial form
	@RequestMapping("/showForm") 
	public String showForm() {
		return "helloworld-form";
	}
	
	// A method to process the form data and show hello world page
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
}
