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
@Table(name="roletable")
@NoArgsConstructor
@AllArgsConstructor

public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleid;
	private String rolename;
	
}
