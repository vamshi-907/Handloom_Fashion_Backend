package com.klef.jfsd.handloomfashion.service;

import com.klef.jfsd.handloomfashion.model.Admin;

public interface AdminService 
{

public String signup (Admin a);
	
	Admin login(String username , String password);
}
