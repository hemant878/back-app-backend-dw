package com.aurionpro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.aurionpro.entity.Account;
import com.aurionpro.repository.IAccountRepository;

@Service
public class AccountServiceImpl implements IAccountService {
	
	private IAccountRepository repository;
	
	public AccountServiceImpl(IAccountRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Account> findAll() {
		return repository.findAll();
	}

	@Override
	public Account save(Account account) {
		return repository.save(account);
	}

	@Override
	public Account findById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Account updateAccount(Account account) {
		return repository.save(account);
	}

	@Override
	public void deleteAccount(int id) {
		 repository.deleteById(id);
	}
	
	


}
