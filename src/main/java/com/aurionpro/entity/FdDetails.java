package com.aurionpro.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="fddetailstable")
@NoArgsConstructor
@AllArgsConstructor

public class FdDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fdid;
	private Date startdate;
	private Date maturitydate;
	private int fdplanid;
	private double fdamount;
	private double maturityamount;

	
}
