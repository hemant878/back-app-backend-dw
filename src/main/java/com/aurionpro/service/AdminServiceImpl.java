package com.aurionpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.entity.Admin;
import com.aurionpro.repository.IAccountAdminRepository;
import com.aurionpro.repository.IAccountRepositoryType;

@Service
public class AdminServiceImpl implements IAdmin{
	
	private IAccountAdminRepository adminrepository;

	public AdminServiceImpl(IAccountAdminRepository adminrepository) {
		super();
		this.adminrepository = adminrepository;
	}

	@Override
	public List<Admin> findAll() {
		return adminrepository.findAll();
	}

	@Override
	public Admin findById(int id) {
		return adminrepository.findById(id).get();
	}

	@Override
	public Admin save(Admin admin) {
		return adminrepository.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		return adminrepository.save(admin);
	}

	@Override
	public void deleteAdmin(int id) {
		adminrepository.deleteById(id);
	}

}
