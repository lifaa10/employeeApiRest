package com.example.employeeRest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeRest.entity.models.Employee;
import com.example.employeeRest.entity.service.IEmployeeService;

/**
 * 
 * @author lifa
 * Clase Controlador para endpoints de empleados
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService iEmployeeService;
	
	/**
	 * Metodo HTTP Get para obtener todos los empleados
	 * @return List<Employee>
	 */
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return iEmployeeService.getAll();
	}
	
	
	/**
	 * Metodo HTTP Get para obtener empleado por Id
	 * @param id
	 * @return Employee
	 */
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable(value = "id") long id){
		return iEmployeeService.get(id);
	}
	
	
	/**
	 * Metodo HTTP Post para crear e insertar nuevo empleado
	 * @param employee
	 */
	@PostMapping("/employee")
	public void addEmployee(Employee employee){
		iEmployeeService.insert(employee);
	}
	
	
	/**
	 * Metodo HTTP Put para actualizar informacion de empleado
	 * @param employee
	 * @param id
	 */
	@PutMapping("/employee/{id}")
	public void updateEmployee(Employee employee,@PathVariable(value = "id") long id) {
		iEmployeeService.update(employee, id);
	}
	
	
	/**
	 * Metodo HTTP Delete para poner como Inactivo a empleado
	 * @param id
	 */
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable(value = "id") long id) {
		iEmployeeService.delete(id);
	}

}
