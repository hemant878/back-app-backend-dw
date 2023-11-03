package com.aurionpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.entity.Transaction;
import com.aurionpro.repository.IAccountTransactionRepository;

@Service
public class TransactionServiceImpl implements ITransaction {

	private IAccountTransactionRepository transactionrepository;
	
	public TransactionServiceImpl(IAccountTransactionRepository transactionrepository) {
		super();
		this.transactionrepository = transactionrepository;
	}

	@Override
	public List<Transaction> findAll() {
		return transactionrepository.findAll();
	}

	@Override
	public Transaction findById(int id) {
		return transactionrepository.findById(id).get();
	}

	@Override
	public Transaction save(Transaction transaction) {
		return transactionrepository.save(transaction);
	}

	@Override
	public Transaction update(Transaction transaction) {
		return transactionrepository.save(transaction);
	}

	@Override
	public void delete(int id) {
		transactionrepository.deleteById(id);
	}

}
