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
import com.aurionpro.entity.AccountType;
import com.aurionpro.service.IAccountServiceType;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AccountTypeController {

	private IAccountServiceType accountservicetype;

	public AccountTypeController(IAccountServiceType accountservicetype) {
		super();
		this.accountservicetype = accountservicetype;
	}

	@GetMapping("/accountstype")
	public List<AccountType> getAccounts(){
		return accountservicetype.findAll();
	}
	
	@GetMapping("/accountstype/{id}")
	public AccountType getAccountsById(@PathVariable int id){
		return accountservicetype.findById(id);
	}
	
	@PostMapping("/accountstype")
	public AccountType addAccounts(@RequestBody AccountType accounttype){
		return accountservicetype.save(accounttype);
	}
	
	@PutMapping("/accountstype/{id}")
	public AccountType updateAccounts(@RequestBody AccountType accounttype) {
		return accountservicetype.updateAccountType(accounttype);
	}
	
	@DeleteMapping("/accountstype/{id}")
	public void deleteAccount(@PathVariable int id) {
		accountservicetype.deleteAccountType(id); 
	}
	
}
