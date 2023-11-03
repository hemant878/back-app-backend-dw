package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aurionpro.entity.AccountType;
import com.aurionpro.entity.Query;
import com.aurionpro.entity.Role;
import com.aurionpro.entity.Transaction;
import com.aurionpro.entity.User;

public interface IAccountQueryRepository extends JpaRepository<Query, Integer> {

}
