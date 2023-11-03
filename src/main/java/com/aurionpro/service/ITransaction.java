package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.Transaction;

public interface ITransaction {

	List<Transaction> findAll();

	Transaction findById(int id);

	Transaction save(Transaction transaction);

	Transaction update(Transaction transaction);

	void delete(int id);

}
