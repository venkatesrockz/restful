package com.example.webservice.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping(path = "/Hello")
	public String HelloWorld()
	{
		return "Hello";
	}
	
	@GetMapping(path = "/HelloBean")
	public HelloworldBean HelloworldBean()
	{
		return new HelloworldBean("Venkatesh");
		
	}
	
}
