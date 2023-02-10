package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.models.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
//	@Query("Select * from employee1")
	
	@Query(value = "select * from employee1",nativeQuery = true)
	List<Employee> findAllEmployee();
}
