package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DepartmentDao;
import com.example.dto.DepartmentDto;
import com.example.models.Department;
import com.example.models.Employee;

@Service
public class DepartmentServices {
	
	@Autowired
	private DepartmentDao dao;
	
	public List<Department> getAll(){
		return (List)dao.findAll();
	}
	
	public Department getById(Long id){
		return dao.findById(id).get();
	}
	
	public boolean addDepartment(Department d) {
		DepartmentDto dto = this.convertFromDepartment(d);
		Department department  = this.convertFromDepartmentDto(dto);
		dao.save(department);
		return true;
	}
	
	private DepartmentDto convertFromDepartment(Department department) {
		DepartmentDto departmentDto = new DepartmentDto();
		departmentDto.setId(department.getId());
		departmentDto.setName(department.getName());
		
		List<Employee> employees = department.getEmp();
		for(Employee e: employees) {
			e.setDept(department);
		}
		departmentDto.setEmployees(employees);
		return departmentDto;
	}
	
	private Department convertFromDepartmentDto(DepartmentDto departmentDto) {
		Department department = new Department();
		department.setId(departmentDto.getId());
		department.setName(departmentDto.getName());
		department.setEmp(departmentDto.getEmployees());
		return department;
	}
}
