package com.klef.jfsd.handloomfashion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.handloomfashion.model.Artsian;
import com.klef.jfsd.handloomfashion.model.Customer;
import com.klef.jfsd.handloomfashion.service.CustomerService;

@RestController
@RequestMapping("customer")

public class CustomerController 
{
	@Autowired CustomerService service;
	
	
	@PostMapping("signup")
	public String signup(@RequestBody Customer c)
	{
		return service.signup(c);
	}
	
	@PostMapping("login")
	public ResponseEntity<String> login(@RequestBody Customer c) {
	    Customer customer = service.login(c.getUsername(), c.getPassword());
	    if (customer != null) {
	        return ResponseEntity.ok("Login Successful");
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
	    }
	}

	 
	 
	  @GetMapping("view")
	    public Iterable<Customer> viewCustomers() {
	        return service.getAllCustomers();
	    }
	 
	  
	    @PutMapping("update/{username}")
	    public String updateCustomer(@PathVariable String username, @RequestBody Customer c) {
	        Customer updatedCustomer = service.updateCustomer(username, c);
	        return updatedCustomer != null ? "Customer updated successfully" : "Customer not found";
	    }

	    @DeleteMapping("delete/{username}")
	    public String deleteCustomer(@PathVariable String username) {
	        return service.deletecustomer(username);
	    }
}
