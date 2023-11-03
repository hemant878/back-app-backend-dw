package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aurionpro.entity.AccountType;
import com.aurionpro.entity.FdPlan;

public interface IAccountFdPlanRepository extends JpaRepository<FdPlan, Integer> {

}
