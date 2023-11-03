package com.aurionpro.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.aurionpro.entity.Account;

public interface IAccountService {

	List<Account> findAll();

	Account save(Account account);

	Account findById(int id);

	Account updateAccount(Account account);

	void deleteAccount(int id);

}
