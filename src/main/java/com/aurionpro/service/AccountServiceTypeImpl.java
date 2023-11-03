package com.aurionpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.entity.AccountType;
import com.aurionpro.repository.IAccountRepositoryType;

@Service
public class AccountServiceTypeImpl implements IAccountServiceType {
	
	private IAccountRepositoryType repositorytype;

	public AccountServiceTypeImpl(IAccountRepositoryType repositorytype) {
		super();
		this.repositorytype = repositorytype;
	}

	@Override
	public List<AccountType> findAll() {
		return repositorytype.findAll();
	}

	@Override
	public AccountType findById(int id) {
		return repositorytype.findById(id).get();
	}

	@Override
	public AccountType save(AccountType accounttype) {
		return repositorytype.save(accounttype);
	}

	@Override
	public AccountType updateAccountType(AccountType accounttype) {
		return repositorytype.save(accounttype);
	}

	@Override
	public void deleteAccountType(int id) {
		repositorytype.deleteById(id);
	}

}
