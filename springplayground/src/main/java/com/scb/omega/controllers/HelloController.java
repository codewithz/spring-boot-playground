package com.scb.omega.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@RequestMapping(method = RequestMethod.GET,value = "/hello")
	public String sayHello()
	{
		return "Hello SCB";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/")
	public String index()
	{
		return "Standard Chartered Bank";
	}
	
	@GetMapping("/hello-world")
	public String testApi()
	{
		return "Hello World";
	}
	
	@GetMapping("/courses")
	public List<String> getCourses()
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("Java");
		list.add("JS");
		list.add("CSS");
		list.add("React");
		list.add("Spring Boot");
		
		return list;
	}
}
