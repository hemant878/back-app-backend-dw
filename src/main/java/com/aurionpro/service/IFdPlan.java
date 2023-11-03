package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.FdPlan;

public interface IFdPlan {

	List<FdPlan> findAll();

	FdPlan findById(int id);

	FdPlan save(FdPlan fdplan);

	FdPlan update(FdPlan fdplan);

	void delete(int id);

	
}
