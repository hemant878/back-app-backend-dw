package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aurionpro.entity.AccountType;
import com.aurionpro.entity.FdDetails;

public interface IAccountFdDetailsRepository extends JpaRepository<FdDetails, Integer> {

}
