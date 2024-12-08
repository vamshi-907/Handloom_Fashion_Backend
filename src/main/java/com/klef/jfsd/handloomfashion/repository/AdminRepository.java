package com.klef.jfsd.handloomfashion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.handloomfashion.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin , String>
{
	  
}
