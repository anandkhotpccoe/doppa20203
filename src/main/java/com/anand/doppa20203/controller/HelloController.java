package com.anand.doppa20203.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/welcome")
	public String getDoppa()
	{
		return "Welcome to Doppa 2020";
	}

}
