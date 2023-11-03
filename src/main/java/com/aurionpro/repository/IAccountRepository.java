package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.entity.Account;

public interface IAccountRepository extends JpaRepository<Account, Integer> {

}
