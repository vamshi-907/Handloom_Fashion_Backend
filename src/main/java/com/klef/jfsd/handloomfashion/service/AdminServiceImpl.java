package com.klef.jfsd.handloomfashion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.handloomfashion.model.Admin;
import com.klef.jfsd.handloomfashion.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService
{

	@Autowired
	public AdminRepository repository;

	@Override
	public String signup(Admin a) {
		repository.save(a);
		return "Admin Added Successfully";
	}

	@Override
	public Admin login(String username, String password) {
		return repository.findById(username)
				.filter(a -> a.getPassword().equals(password))
                .orElse(null);
	}
	

}
