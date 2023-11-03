package com.aurionpro.entity;

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
@Table(name="fdplantable")
@NoArgsConstructor
@AllArgsConstructor

public class FdPlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fdplanid;
	private int numberofdays;
	private int interest;
	private boolean active;


	
}
