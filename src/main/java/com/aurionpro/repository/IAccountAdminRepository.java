package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aurionpro.entity.AccountType;
import com.aurionpro.entity.Admin;

public interface IAccountAdminRepository extends JpaRepository<Admin, Integer> {

}
