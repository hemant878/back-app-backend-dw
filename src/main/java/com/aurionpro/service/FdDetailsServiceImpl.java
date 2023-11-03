package com.aurionpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.entity.FdDetails;
import com.aurionpro.repository.IAccountFdDetailsRepository;

@Service
public class FdDetailsServiceImpl implements IFdDetails {

	private IAccountFdDetailsRepository fddetailsrepository;
	
	
	public FdDetailsServiceImpl(IAccountFdDetailsRepository fddetailsrepository) {
		super();
		this.fddetailsrepository = fddetailsrepository;
	}

	@Override
	public List<FdDetails> findAll() {
		return fddetailsrepository.findAll();
	}

	@Override
	public FdDetails findById(int id) {
		return fddetailsrepository.findById(id).get();
	}

	@Override
	public FdDetails save(FdDetails fddetails) {
		return fddetailsrepository.save(fddetails);
	}

	@Override
	public FdDetails update(FdDetails fddetails) {
		return fddetailsrepository.save(fddetails);
	}

	@Override
	public void delete(int id) {
		fddetailsrepository.deleteById(id);
	}

}
