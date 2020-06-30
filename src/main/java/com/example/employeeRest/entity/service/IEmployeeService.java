package com.example.employeeRest.entity.service;

import java.util.List;

import com.example.employeeRest.entity.models.Employee;

public interface IEmployeeService {
	
	public Employee get(long idEmployee);
	
	public List<Employee> getAll();
	
	public void insert(Employee employee);
	
	public void update(Employee employee,long id);
	
	public void delete(long id);

}
