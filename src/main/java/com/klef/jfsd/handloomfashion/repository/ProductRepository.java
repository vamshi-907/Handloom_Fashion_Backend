package com.klef.jfsd.handloomfashion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.handloomfashion.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
