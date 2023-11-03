package com.aurionpro.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="accounttable")
@NoArgsConstructor
@AllArgsConstructor

public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountno;
	private int userid;
	private int typeid;
	private double balance;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;
    
    @ManyToOne
    @JsonIgnore
    private User user;
    
    @OneToOne(mappedBy = "account")
    private AccountType accounttype;
    
}
