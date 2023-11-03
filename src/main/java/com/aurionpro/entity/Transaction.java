package com.aurionpro.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="transactiontable")
@NoArgsConstructor
@AllArgsConstructor

public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionid;
	private int accountno;
	private int receiveraccountno;
	private String transactiontype;
	private Date transactiondate;
	private double transactionamount;

    @ManyToOne
    @JoinColumn(name="account_id")
    @JsonIgnore
    private Account account;
	
}
