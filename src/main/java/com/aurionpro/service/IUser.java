package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.User;

public interface IUser {

	List<User> findAll();

	User findById(int id);

	User save(User user);

	User update(User user);

	void delete(int id);

}
