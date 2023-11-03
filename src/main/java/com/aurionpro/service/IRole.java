package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.Role;

public interface IRole {

	List<Role> findAll();

	Role findById(int id);

	Role save(Role role);

	Role update(Role role);

	void delete(int id);

}
