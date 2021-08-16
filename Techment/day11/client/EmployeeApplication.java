package com.Techment.day11.client;

import java.util.List;
import java.util.Scanner;
import com.Techment.day11.service.EmployeeServiceImpl;
import com.Techment.day11.service.IEmployeeService;

import com.Techment.day11.modal.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {

		IEmployeeService service=new EmployeeServiceImpl();
		System.out.println("===========Employee Application===========");
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the id to fetch employee");
		int id =scanner.nextInt();
		
		Employee employee=service.getEmployeeById(id);
		System.out.println(employee);
		
		System.out.println("enter the dept to fetch employee");
		String dept =scanner.next();
		List<Employee> employees=service.getEmployeeByDept(dept);
		System.out.println(employees);
		
		
		
	}

}
