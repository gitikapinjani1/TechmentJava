package com.techment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody	//convert java object to json and send back to client
//@RestController    //combination of @controller and @responseBody
public class HelloWorldController {
	
	
	//GET HTTP method
	@GetMapping("/helloWorld")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	

}
