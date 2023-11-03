package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.AccountType;

public interface IAccountServiceType {

	List<AccountType> findAll();

	AccountType findById(int id);

	AccountType save(AccountType accounttype);

	AccountType updateAccountType(AccountType accounttype);

	void deleteAccountType(int id);

}
