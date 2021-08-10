package com.scb.omega.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.omega.beans.Customer;
import com.scb.omega.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	//@Autowired
	//public CustomerController(CustomerService customerService) {
	//	this.customerService=customerService;
		// TODO Auto-generated constructor stub
 //	}
	
	
	
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable("id") int id)
	{
		Customer c=customerService.getCustomer(id);
		return c;
	}
	
	@GetMapping("/getCustomerById")
	public Customer getCustomerById(@RequestParam("id") int id)
	{
		Customer c=customerService.getCustomer(id);
		return c;
	}
	
	
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers()
	{
		List<Customer> list=customerService.getAllCustomers();
		return list;
	}

}
