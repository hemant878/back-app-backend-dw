package com.aurionpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.entity.FdPlan;
import com.aurionpro.repository.IAccountFdPlanRepository;

@Service
public class FdPlanServiceImpl implements IFdPlan {
	
	private IAccountFdPlanRepository fdplanrepository;
	
	public FdPlanServiceImpl(IAccountFdPlanRepository fdplanrepository) {
		super();
		this.fdplanrepository = fdplanrepository;
	}

	@Override
	public List<FdPlan> findAll() {
		return fdplanrepository.findAll();
	}

	@Override
	public FdPlan findById(int id) {
		return fdplanrepository.findById(id).get();
	}

	@Override
	public FdPlan save(FdPlan fdplan) {
		return fdplanrepository.save(fdplan);
	}

	@Override
	public FdPlan update(FdPlan fdplan) {
		return fdplanrepository.save(fdplan);
	}

	@Override
	public void delete(int id) {
		fdplanrepository.deleteById(id);
	}

}
