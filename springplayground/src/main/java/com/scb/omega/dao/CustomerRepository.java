package com.scb.omega.dao;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.scb.omega.beans.Customer;

@Repository
public class CustomerRepository 
{
	public List<Customer> getAllCustomers()
	{
		List<Customer> list=new ArrayList<>();
		Customer c1=new Customer(1, "Tom", "tom@gmail.com", 1234567, true, LocalDate.of(1995,Month.OCTOBER,15));
		Customer c2=new Customer(2, "Alex", "alex@gmail.com", 1234568, true, LocalDate.of(1994,Month.NOVEMBER,9));
		Customer c3=new Customer(3, "Mike", "mike@gmail.com", 1234569, false, LocalDate.of(1997,Month.FEBRUARY,23));
		Customer c4=new Customer(4, "John", "john@gmail.com", 1234570, true, LocalDate.of(1992,Month.APRIL,25));
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		
		return list;
		
	}
}
