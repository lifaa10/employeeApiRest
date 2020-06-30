package com.example.employeeRest.entity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeRest.entity.dao.IEmployeeDao;
import com.example.employeeRest.entity.models.Employee;


@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao iEmployeeDao;
	
	
	@Override
	public Employee get(long idEmployee) {
		// TODO Auto-generated method stub
		Employee employee = iEmployeeDao.findById(idEmployee).get();
		if(employee.getStatus().equals("A")) {
			return employee;
		}else {
			return null;
		}
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		List<Employee> lstEmployeeTemp = (List<Employee>) iEmployeeDao.findAll();
		List<Employee> lstEmployee = new ArrayList<>();
		for(Employee employee : lstEmployeeTemp) {
			if(employee.getStatus().equals("A")) {
				lstEmployee.add(employee);
			}
		}
		return lstEmployee;
	}

	@Override
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		employee.setStatus("A");
		iEmployeeDao.save(employee);
	}

	@Override
	public void update(Employee employee,long id) {
		// TODO Auto-generated method stub
		iEmployeeDao.findById(id).ifPresent((x)->{
			employee.setIdEmployee(id);
			iEmployeeDao.save(employee);
		});
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		iEmployeeDao.findById(id).ifPresent((x)->{
			Employee employee = iEmployeeDao.findById(id).get();
			employee.setStatus("I");
			iEmployeeDao.save(employee);
		});
	}

}
