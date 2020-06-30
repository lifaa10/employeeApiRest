package com.example.employeeRest.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.employeeRest.entity.models.Employee;

public interface IEmployeeDao extends CrudRepository<Employee, Long>{

}
