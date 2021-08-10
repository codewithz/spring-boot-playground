package com.scb.omega.services;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.omega.beans.Customer;
import com.scb.omega.dao.CustomerRepository;

@Service
public class CustomerService 
{
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer getCustomer(int id)
	{
		Customer c=null;
		List<Customer> list=customerRepository.getAllCustomers();
		for(Customer cust:list)
		{
			if(cust.getId()==id)
			{
				c=cust;
				break;
			}
		}
		
		return c;
	}
	
	public List<Customer> getAllCustomers()
	{
	
		List<Customer> list=customerRepository.getAllCustomers();
		return list;
		
	}
	
}
