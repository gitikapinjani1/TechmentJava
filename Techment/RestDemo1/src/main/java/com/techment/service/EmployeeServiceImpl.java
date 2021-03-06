package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.EmployeeDao;
import com.techment.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	@Override
	public String addEmployee(Employee employee) {
		employeeDao.save(employee);
		return "Employees added";
	}

	@Override
	public List<Employee> viewAllEmployee() {
		return employeeDao.findAll();
	}

	
	//getbyid or findbyid
	@Override
	public Employee viewEmployeeById(int id) {
		
		
		return employeeDao.findById(id).get();
	}

	
	
}
