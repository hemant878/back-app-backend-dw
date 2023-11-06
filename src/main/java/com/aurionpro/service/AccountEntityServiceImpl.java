package com.aurionpro.service;

import org.springframework.stereotype.Service;

import com.aurionpro.entity.AccountsEntity;
import com.aurionpro.repository.AccountEntityRepository;

@Service
public class AccountEntityServiceImpl implements AccounEntityService{

	private AccountEntityRepository accountsRepository;
	
	
	public AccountEntityServiceImpl(AccountEntityRepository accountsRepository) {
		super();
		this.accountsRepository = accountsRepository;
	}


	@Override

    public void depositFunds(int accountId, int amount) {
        AccountsEntity account = accountsRepository.findById(accountId).orElse(null);
        if (account != null) {
            account.deposit(amount);
            accountsRepository.save(account);
        } else {
            // Handle the case when the account with the given accountId doesn't exist.
        }
    }


	@Override
	public void withdrawFunds(int accountId, int amount) {
		 AccountsEntity account = accountsRepository.findById(accountId).orElse(null);
	        if (account != null) {
	            account.withdraw(amount);
	            accountsRepository.save(account);
	        } else {
	            // Handle the case when the account with the given accountId doesn't exist.
	        }
		
	}

	
	
}
