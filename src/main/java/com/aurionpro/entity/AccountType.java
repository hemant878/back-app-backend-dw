package com.aurionpro.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="accounttypetable")
@NoArgsConstructor
@AllArgsConstructor

public class AccountType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accounttypeid;
	private String accounttypename;
	
	@OneToOne
	@JsonIgnore
	private Account account;
	
}
