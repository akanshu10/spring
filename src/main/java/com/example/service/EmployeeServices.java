package com.example.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DepartmentDao;
import com.example.dao.EmployeeDao;
import com.example.dto.DepartmentDto;
import com.example.dto.EmployeeDto;
import com.example.models.Department;
import com.example.models.Employee;

@Service
public class EmployeeServices {
	
	@Autowired
	private EmployeeDao dao;
	@Autowired
	private DepartmentDao ddao;
	
	public List<Employee> getAll(){
//		List<Employee> lst = (List<Employee>) dao.findAllEmployee();
//		System.out.println("Hello");
		return dao.findAllEmployee();
	}
	
	public Employee getById(Long id) {
//		Optional<Employee> e = dao.findById(id);
		return this.convertFromEmployeeDto(this.convertFromEmployee(dao.findById(id).get()));
//		return e;
	}
	
	public Department getByEmployeeId(long id) {
		 Optional<Employee> e = dao.findById(id);
		 Employee employee = e.get();
		 return employee.getDept();
	}
	
	public boolean addEmployee(Employee emp) {
		dao.save(emp);
		return true;
	}
	
	private EmployeeDto convertFromEmployee(Employee emp) {
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setId(emp.getId());
		employeeDto.setDeptid(emp.getDept().getId());
		employeeDto.setDeptName(emp.getDept().getName());
		employeeDto.setName(emp.getName());
		employeeDto.setCname(emp.getCName());
		return employeeDto;
	}
	
	private Employee convertFromEmployeeDto(EmployeeDto dto) {
		Employee emp = new Employee();
		emp.setId(dto.getId());
		emp.setName(dto.getName());
		
		Department dp = new Department();
		dp.setId(dto.getDeptid());
		dp.setName(dto.getDeptName());
		
		emp.setDept(dp);
		emp.setCName(dto.getCname());
		return emp;
	}
	
	
}
