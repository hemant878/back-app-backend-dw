package com.aurionpro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Query;
import com.aurionpro.entity.Transaction;
import com.aurionpro.entity.User;
import com.aurionpro.service.IQuery;
import com.aurionpro.service.ITransaction;
import com.aurionpro.service.IUser;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class QueryController {

	private IQuery queryservice;

	public QueryController(IQuery queryservice) {
		super();
		this.queryservice = queryservice;
	}

	@GetMapping("/query")
	public List<Query> getQuery(){
		return queryservice.findAll();
	}
	
	@GetMapping("/query/{id}")
	public Query getQueryById(@PathVariable int id){
		return queryservice.findById(id);
	}
	
	@PostMapping("/query")
	public Query addQuery(@RequestBody Query query){
		return queryservice.save(query);
	}
	
	@PutMapping("/query/{id}")
	public Query updateQuery(@RequestBody Query query) {
		return queryservice.update(query);
	}
	
	@DeleteMapping("/query/{id}")
	public void deleteQuery(@PathVariable int id) {
		queryservice.delete(id); 
	}
}
