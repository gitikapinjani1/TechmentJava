package com.techment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloController")
public class HelloController {
	
	@GetMapping("/")
	public String getMessage() {
		return "this is hello controller";
	}
	
	
}
