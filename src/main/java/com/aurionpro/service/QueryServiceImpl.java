package com.aurionpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.entity.FdPlan;
import com.aurionpro.entity.Query;
import com.aurionpro.entity.User;
import com.aurionpro.repository.IAccountFdPlanRepository;
import com.aurionpro.repository.IAccountQueryRepository;

@Service
public class QueryServiceImpl implements IQuery {
	
	private IAccountQueryRepository queryrepository;
	
	public QueryServiceImpl(IAccountQueryRepository queryrepository) {
		super();
		this.queryrepository = queryrepository;
	}

	@Override
	public List<Query> findAll() {
		return queryrepository.findAll();
	}

	@Override
	public Query findById(int id) {
		return queryrepository.findById(id).get();
	}

	@Override
	public Query save(Query query) {
		return queryrepository.save(query);
	}

	@Override
	public Query update(Query query) {
		return queryrepository.save(query);
	}

	@Override
	public void delete(int id) {
		queryrepository.deleteById(id);
	}

}
