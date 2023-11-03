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

import com.aurionpro.entity.Account;
import com.aurionpro.entity.Admin;
import com.aurionpro.service.IAccountService;
import com.aurionpro.service.IAdmin;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {
	
	private IAdmin adminservice;

	public AdminController(IAdmin adminservice) {
		super();
		this.adminservice = adminservice;
	}

	@GetMapping("/admin")
	public List<Admin> getAdmin(){
		return adminservice.findAll();
	}
	
	@GetMapping("/admin/{id}")
	public Admin getAdminById(@PathVariable int id){
		return adminservice.findById(id);
	}
	
	@PostMapping("/admin")
	public Admin addAdmin(@RequestBody Admin admin){
		return adminservice.save(admin);
	}
	
	@PutMapping("/admin/{id}")
	public Admin updateAdmin(@RequestBody Admin admin) {
		return adminservice.updateAdmin(admin);
	}
	
	@DeleteMapping("/admin/{id}")
	public void deleteAdmin(@PathVariable int id) {
		adminservice.deleteAdmin(id); 
	}
	
	
	

}
