package com.technoelevate.mongodb.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Employee implements Serializable{
	
	@Transient
	public static final String SEQUENCE_NAME= "TYSS";
	
	@Id
	private String employeeId;
	private String name;
	private String email;

	

}
