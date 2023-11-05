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
@Table(name="fileentrytable")
@NoArgsConstructor
@AllArgsConstructor
public class FileEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int typeid;
	private double balance; 
    private String fileName;
    private String filepancard;
    private String fileadharcard;
   
}
