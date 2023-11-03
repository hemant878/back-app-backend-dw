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

import com.aurionpro.entity.FdDetails;
import com.aurionpro.entity.Role;
import com.aurionpro.service.IFdDetails;
import com.aurionpro.service.IRole;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RoleController {

	private IRole roleservice;

	public RoleController(IRole roleservice) {
		super();
		this.roleservice = roleservice;
	}

	@GetMapping("/role")
	public List<Role> getRole(){
		return roleservice.findAll();
	}
	
	@GetMapping("/role/{id}")
	public Role getRoleById(@PathVariable int id){
		return roleservice.findById(id);
	}
	
	@PostMapping("/role")
	public Role addRole(@RequestBody Role role){
		return roleservice.save(role);
	}
	
	@PutMapping("/role/{id}")
	public Role updateRole(@RequestBody Role role) {
		return roleservice.update(role);
	}
	
	@DeleteMapping("/role/{id}")
	public void deleteRole(@PathVariable int id) {
		roleservice.delete(id); 
	}
}
