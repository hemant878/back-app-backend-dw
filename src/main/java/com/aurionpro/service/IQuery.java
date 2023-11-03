package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.Query;


public interface IQuery {

	List<Query> findAll();

	Query findById(int id);

	Query save(Query query);

	Query update(Query query);

	void delete(int id);


}
