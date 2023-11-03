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

import com.aurionpro.entity.Transaction;
import com.aurionpro.entity.User;
import com.aurionpro.service.ITransaction;
import com.aurionpro.service.IUser;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	private IUser userservice;

	public UserController(IUser userservice) {
		super();
		this.userservice = userservice;
	}

	@GetMapping("/user")
	public List<User> getUser(){
		return userservice.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id){
		return userservice.findById(id);
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user){
		return userservice.save(user);
	}
	
	@PutMapping("/user/{id}")
	public User updateUser(@RequestBody User user) {
		return userservice.update(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userservice.delete(id); 
	}
}
