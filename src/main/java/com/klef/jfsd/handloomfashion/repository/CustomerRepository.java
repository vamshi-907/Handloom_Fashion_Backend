package com.klef.jfsd.handloomfashion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.handloomfashion.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String>
{
	
}
