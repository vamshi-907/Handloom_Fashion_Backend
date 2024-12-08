package com.klef.jfsd.handloomfashion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.handloomfashion.model.Admin;
import com.klef.jfsd.handloomfashion.model.Artsian;
import com.klef.jfsd.handloomfashion.service.AdminService;


@RestController
@RequestMapping("admin")

public class AdminController 

{
	@Autowired
	public AdminService service;
	
	@PostMapping("signup")
	public String signup(@RequestBody Admin a) 
	{
	return service.signup(a);	
	}
	
	
	@PostMapping("login")
	public String login(@RequestBody Admin a) {
		Admin admin = service.login(a.getUsername(), a.getPassword());
		return admin != null ? "Login Successful" : "Invalid Credentials";
	}
}
