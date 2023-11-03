package com.aurionpro.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="accountrequesttable")
@NoArgsConstructor
@AllArgsConstructor

public class AccountRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private int typeid;
	private double balance; 
	@Lob
    private byte[] photo;
}
