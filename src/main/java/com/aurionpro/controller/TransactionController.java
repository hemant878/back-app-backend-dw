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

import com.aurionpro.entity.Role;
import com.aurionpro.entity.Transaction;
import com.aurionpro.service.IRole;
import com.aurionpro.service.ITransaction;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TransactionController {
	
	private ITransaction transactionservice;

	public TransactionController(ITransaction transactionservice) {
		super();
		this.transactionservice = transactionservice;
	}

	@GetMapping("/transaction")
	public List<Transaction> getTransaction(){
		return transactionservice.findAll();
	}
	
	@GetMapping("/transaction/{id}")
	public Transaction getTransactionById(@PathVariable int id){
		return transactionservice.findById(id);
	}
	
	@PostMapping("/transaction")
	public Transaction addTransaction(@RequestBody Transaction transaction){
		return transactionservice.save(transaction);
	}
	
	@PutMapping("/transaction/{id}")
	public Transaction updateTransaction(@RequestBody Transaction transaction) {
		return transactionservice.update(transaction);
	}
	
	@DeleteMapping("/transaction/{id}")
	public void deleteTransaction(@PathVariable int id) {
		transactionservice.delete(id); 
	}

}
