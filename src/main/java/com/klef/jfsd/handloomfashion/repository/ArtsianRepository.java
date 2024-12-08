package com.klef.jfsd.handloomfashion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.handloomfashion.model.Artsian;

@Repository
public interface ArtsianRepository extends CrudRepository<Artsian , String>
{

}
