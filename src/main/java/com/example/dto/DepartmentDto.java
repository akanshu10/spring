package com.example.dto;

import java.util.List;

import com.example.models.Employee;

import lombok.Data;

@Data
public class DepartmentDto {
	private Long id;
	private String name;
	private List<Employee> employees;
}
