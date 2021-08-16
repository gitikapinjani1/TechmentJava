package com.Techment.day11.service;

import java.util.List;

import com.Techment.day11.modal.Employee;

public interface IEmployeeService {

	Employee getEmployeeById(int id);
	List<Employee> getEmployeeByDept(String dept);
	
	
}
