package com.aurionpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.entity.Role;
import com.aurionpro.repository.IAccountRoleRepository;

@Service
public class RoleServiceImpl implements IRole {

	private IAccountRoleRepository rolerepository;
	
	
	public RoleServiceImpl(IAccountRoleRepository rolerepository) {
		super();
		this.rolerepository = rolerepository;
	}

	@Override
	public List<Role> findAll() {
		return rolerepository.findAll();
	}

	@Override
	public Role findById(int id) {
		return rolerepository.findById(id).get();
	}

	@Override
	public Role save(Role role) {
		return rolerepository.save(role);
	}

	@Override
	public Role update(Role role) {
		return rolerepository.save(role);
	}

	@Override
	public void delete(int id) {
		rolerepository.deleteById(id);
	}

}
