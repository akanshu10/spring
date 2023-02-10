package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.DepartmentDao;
import com.example.dao.EmployeeDao;
import com.example.models.Department;
import com.example.models.Employee;

@SpringBootApplication
public class SpringBootDemoProject3Application {

//	@Autowired
//	private static EmployeeDao edao;
//	@Autowired
//	private static DepartmentDao ddao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoProject3Application.class, args);
		
		
		
//		Department d1 = new Department();
//		d1.setId(1);
//		d1.setName("dev");
//		
//		Department d2 = new Department();
//		d2.setId(2);
//		d2.setName("test");
//		
//		Employee e1 = new Employee();
//		e1.setId(1);
//		e1.setName("Akankshu");
//		e1.setCName("Company");
//		e1.setDept(d1);
//		
//		Employee e2 = new Employee();
//		e2.setId(2);
//		e2.setName("Rajat");
//		e2.setCName("Company");
//		e2.setDept(d1);
//		
//		Employee e3 = new Employee();
//		e3.setId(3);
//		e3.setName("Nitin");
//		e3.setCName("Company");
//		e3.setDept(d1);
//		
//		Employee e4 = new Employee();
//		e4.setId(4);
//		e4.setName("Prakash");
//		e4.setCName("Company");
//		e4.setDept(d2);
//		
//		List<Employee> lst1 = new ArrayList<>();
//		lst1.add(e1);
//		lst1.add(e2);
//		lst1.add(e3);
//		
//		d1.setEmp(lst1);
//		
//		List<Employee> lst2 = new ArrayList<>();
//		lst2.add(e4);
//		
//		d2.setEmp(lst2);
//		
//		edao.save(e1);
//		edao.save(e2);
//		edao.save(e3);
//		edao.save(e4);
//		
//		ddao.save(d1);
//		ddao.save(d2);
//		
	}

}
