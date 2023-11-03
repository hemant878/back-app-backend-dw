package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.Admin;

public interface IAdmin {

	List<Admin> findAll();

	Admin findById(int id);

	Admin save(Admin admin);

	Admin updateAdmin(Admin admin);

	void deleteAdmin(int id);


}
