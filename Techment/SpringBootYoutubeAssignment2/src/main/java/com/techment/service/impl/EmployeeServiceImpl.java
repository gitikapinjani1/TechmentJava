package com.techment.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.techment.exception.ResourceNotFoundException;
import com.techment.modal.Employee;
import com.techment.repository.EmployeeRepository;
import com.techment.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees()  {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) throws NoSuchElementException{
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}
		return employeeRepository.findById(id).get();
		
	}

	@Override
	public Employee updateEmployee(Employee employee, int id) throws NoSuchElementException {
		
		// we need to check whether employee with given id is exist in DB or not
		Employee existingEmployee = employeeRepository.findById(id).get(); 
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		// save existing employee to DB
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}

	@Override
	public void deleteEmployee(int id) throws NoSuchElementException {
		
		// check whether a employee exist in a DB or not
		employeeRepository.findById(id).get();
		employeeRepository.deleteById(id);
	}
	
}
