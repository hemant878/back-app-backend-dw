package com.aurionpro.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="usertable")
@NoArgsConstructor
@AllArgsConstructor

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String firstname;
	private String lastname;
	private String username;
	private String gender;
	private String email;
	private int password;
	private int roleid;
	
    @OneToMany(mappedBy = "user")
    private List<Account> accounts;
	
}
