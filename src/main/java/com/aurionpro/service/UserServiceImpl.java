package com.aurionpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.entity.User;
import com.aurionpro.repository.IAccountUserRepository;

@Service
public class UserServiceImpl implements IUser{
	
	private IAccountUserRepository userrepository;
	
	

	public UserServiceImpl(IAccountUserRepository userrepository) {
		super();
		this.userrepository = userrepository;
	}

	@Override
	public List<User> findAll() {
		return userrepository.findAll();
	}

	@Override
	public User findById(int id) {
		return userrepository.findById(id).get();
	}

	@Override
	public User save(User user) {
		return userrepository.save(user);
	}

	@Override
	public User update(User user) {
		return userrepository.save(user);
	}

	@Override
	public void delete(int id) {
		userrepository.deleteById(id);
	}

}
