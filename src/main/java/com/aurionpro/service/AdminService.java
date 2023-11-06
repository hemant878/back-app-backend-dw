package com.aurionpro.service;

//import org.springframework.stereotype.Service;

import com.aurionpro.entity.AdminEntity;

public interface AdminService {

	AdminEntity findAdminByUsernameAndPassword(String username, String password);

	AdminEntity findAdminById(int id);

}
