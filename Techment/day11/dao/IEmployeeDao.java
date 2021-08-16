package com.Techment.day11.dao;

import java.util.List;

import com.Techment.day11.modal.Employee;
public interface IEmployeeDao {

	Employee getEmployeeById(int id);
	List<Employee> getEmployeeByDept(String dept);
	
}
