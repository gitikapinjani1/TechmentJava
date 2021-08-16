package com.Techment.day11.service;

import java.util.List;

import com.Techment.day11.dao.EmployeeDaoImpl;
import com.Techment.day11.dao.IEmployeeDao;
import com.Techment.day11.modal.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	
	IEmployeeDao employeeDao=new EmployeeDaoImpl();

	public Employee getEmployeeById(int id) {

		return employeeDao.getEmployeeById(id);
	}

	public List<Employee> getEmployeeByDept(String dept) {
		return employeeDao.getEmployeeByDept(dept);
		
	}
	
	

}
