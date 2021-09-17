package com.techment.service;

import java.util.List;

import com.techment.modal.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	Employee updateEmployee(Employee employee, int id);
	void deleteEmployee(int id);
}