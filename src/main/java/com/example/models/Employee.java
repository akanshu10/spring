package com.example.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee1")
@Data
public class Employee {
	@Id
	private Long id;
	private String name;
	private String cName;
	
	@ManyToOne(cascade = CascadeType.ALL)
//	@JsonIgnore
	private Department dept;
}
