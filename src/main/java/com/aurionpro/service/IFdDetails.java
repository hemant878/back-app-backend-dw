package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.FdDetails;

public interface IFdDetails {

	List<FdDetails> findAll();

	FdDetails findById(int id);

	FdDetails save(FdDetails fddetails);

	FdDetails update(FdDetails fddetails);

	void delete(int id);


}
