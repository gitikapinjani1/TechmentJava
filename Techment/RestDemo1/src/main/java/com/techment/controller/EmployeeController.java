package com.techment.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;

@RestController
@RequestMapping(value="/employeeController")
public class EmployeeController {
	ArrayList<Employee> employees =new ArrayList<Employee>();
	
	public EmployeeController(){
	employees.add(new Employee(1,"sachin","hr"));
	employees.add(new Employee(2,"gitika","hr"));
	}
	
	@GetMapping(value="/showMessage")
	public String display()
	{
		return "this is my first demo";
	}
	
	@GetMapping(value="/employeeDetails")
	public ArrayList<Employee> showEmployee(){
		
		//employees=new ArrayList<Employee>();
		return employees;
	}
	
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping(value = "/addNewEmployee")
	public String addEmployee(@RequestBody Employee employee)
	{
		employees.add(employee);
		return " Employee added";
	}	
}
