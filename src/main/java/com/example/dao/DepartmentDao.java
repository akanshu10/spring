package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Department;
@Repository
public interface DepartmentDao extends CrudRepository<Department, Long> {

}
