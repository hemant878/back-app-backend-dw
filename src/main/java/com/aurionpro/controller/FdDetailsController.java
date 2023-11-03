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

import com.aurionpro.entity.Admin;
import com.aurionpro.entity.FdDetails;
import com.aurionpro.service.IAdmin;
import com.aurionpro.service.IFdDetails;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FdDetailsController {
	
	private IFdDetails fdservice;

	public FdDetailsController(IFdDetails fdservice) {
		super();
		this.fdservice = fdservice;
	}

	@GetMapping("/fddetails")
	public List<FdDetails> getFdDetails(){
		return fdservice.findAll();
	}
	
	@GetMapping("/fddetails/{id}")
	public FdDetails getFdDetailsById(@PathVariable int id){
		return fdservice.findById(id);
	}
	
	@PostMapping("/fddetails")
	public FdDetails addFdDetails(@RequestBody FdDetails fddetails){
		return fdservice.save(fddetails);
	}
	
	@PutMapping("/fddetails/{id}")
	public FdDetails updateFdDetails(@RequestBody FdDetails fddetails) {
		return fdservice.update(fddetails);
	}
	
	@DeleteMapping("/fddetails/{id}")
	public void deleteFdDetails(@PathVariable int id) {
		fdservice.delete(id); 
	}
	
}
	
