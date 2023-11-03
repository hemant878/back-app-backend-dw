package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aurionpro.entity.AccountType;
import com.aurionpro.entity.Role;
import com.aurionpro.entity.Transaction;

public interface IAccountTransactionRepository extends JpaRepository<Transaction, Integer> {

}
