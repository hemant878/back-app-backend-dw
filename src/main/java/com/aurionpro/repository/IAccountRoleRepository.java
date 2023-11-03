package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aurionpro.entity.AccountType;
import com.aurionpro.entity.Role;

public interface IAccountRoleRepository extends JpaRepository<Role, Integer> {

}
