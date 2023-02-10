package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Department;
import com.example.models.Employee;
import com.example.service.DepartmentServices;
import com.example.service.EmployeeServices;

@RestController
public class WebController {
	
	@Autowired
	private EmployeeServices services;
	
	@Autowired
	private DepartmentServices dseServices;
	
//	@RequestMapping(value = "/",method = RequestMethod.GET)
//	@GetMapping("/") 
//	public String home() {
//		return "AKankshu";
//	}
	
	@PostMapping("/employee")
	public boolean addEmployee(@RequestBody Employee e) {
		
		return services.addEmployee(e);
	}
	
	@PostMapping("/department")
	public boolean addDepartment(@RequestBody Department d) {
		return dseServices.addDepartment(d);
	}
	
	@GetMapping(value="/employees")
	public List<Employee> getEmployee() {
		System.out.println("method employees");
		return services.getAll();
//		return null;
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployeeById(@PathVariable("employeeId") Long id) {
		return services.getById(id);
	}
	
	@GetMapping("/department/{departmentId}")
	public Department getDepartment(@PathVariable("departmentId") long id) {
		return dseServices.getById(id);
	}
	
	@GetMapping("/department/employee/{employeeId}")
	public Department getDepartmentByEmpId(@PathVariable("employeeId") long id) {
		return services.getByEmployeeId(id);
	}
}
