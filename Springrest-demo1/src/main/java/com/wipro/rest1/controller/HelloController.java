package com.wipro.rest1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("api/v1/sample")
@RestController
public class HelloController {
	@GetMapping
	public String sayHello1()
	{
		return "Welcome to Spring rest demo1";
	}
	
}
