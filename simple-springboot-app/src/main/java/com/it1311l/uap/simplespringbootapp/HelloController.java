package com.it1311l.uap.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@GetMapping("/sayHello")
	public String sayHello()
	{
		return "Hello Roice Pogi and Handsome";
	}
}
