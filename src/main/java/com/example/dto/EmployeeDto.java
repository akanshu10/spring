package com.example.dto;

import lombok.Data;

@Data
public class EmployeeDto {
	
	private Long id;
	private String name;
	private Long deptid;
	private String deptName;
	private String cname;
}
