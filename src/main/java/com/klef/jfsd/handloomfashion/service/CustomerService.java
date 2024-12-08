package com.klef.jfsd.handloomfashion.service;

import com.klef.jfsd.handloomfashion.model.Artsian;
import com.klef.jfsd.handloomfashion.model.Customer;

public interface CustomerService 
{
	public String signup(Customer c);
	
	 Customer login(String username, String password);
	 
	    public Iterable<Customer> getAllCustomers() ;
	    Customer updateCustomer(String username, Customer c);
	    String deletecustomer(String username);
}

