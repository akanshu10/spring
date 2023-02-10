package com.example.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "department1")
@Data
public class Department {
	
	@Id
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JsonIgnore
	private List<Employee> emp;
//	
//	@OneToMany(mappedBy = "dept")
//	private List<Employee> emp;
}
