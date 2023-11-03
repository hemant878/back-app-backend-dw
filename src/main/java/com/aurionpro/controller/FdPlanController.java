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
import com.aurionpro.entity.FdPlan;
import com.aurionpro.service.IFdDetails;
import com.aurionpro.service.IFdPlan;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FdPlanController {

	private IFdPlan fdserviceplan;

	public FdPlanController(IFdPlan fdserviceplan) {
		super();
		this.fdserviceplan = fdserviceplan;
	}

	@GetMapping("/fdplan")
	public List<FdPlan> getFdPlanDetails(){
		return fdserviceplan.findAll();
	}
	
	@GetMapping("/fdplan/{id}")
	public FdPlan getFdPlanById(@PathVariable int id){
		return fdserviceplan.findById(id);
	}
	
	@PostMapping("/fdplan")
	public FdPlan addFdPlan(@RequestBody FdPlan fdplan){
		return fdserviceplan.save(fdplan);
	}
	
	@PutMapping("/fdplan/{id}")
	public FdPlan updateFdPlan(@RequestBody  FdPlan fdplan) {
		return fdserviceplan.update(fdplan);
	}
	
	@DeleteMapping("/fdplan/{id}")
	public void deleteFdPlan(@PathVariable int id) {
		fdserviceplan.delete(id); 
	}
}
