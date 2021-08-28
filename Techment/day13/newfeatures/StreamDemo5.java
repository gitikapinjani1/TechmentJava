package com.techment.day13.newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.techment.day12.newFeatures.Employee;

public class StreamDemo5 {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "sachin", "developer", 120000, 38));
		employees.add(new Employee(2, "kumar", "hr", 45000, 28));
		employees.add(new Employee(3, "anil", "hr", 55000, 24));
		employees.add(new Employee(4, "john", "manager", 84000, 32));
		employees.add(new Employee(5, "rahul", "hr", 60000, 27));
		employees.add(new Employee(6, "sourab", "developer", 70000, 27));

		employees.stream().map(e->"name "+ e.getName()+"salary "+ e.getSalary()+"salary increase by 20% "+(e.getSalary()*0.20)).forEach(System.out::println);
		
		List<String> li=employees.stream().map(e->"name "+e.getName()+"salary "+e.getSalary()*0.20).collect(Collectors.toList());
	
		StreamDemo5 streamDemo5=new StreamDemo5();
		Long hrSumSalary=streamDemo5.deptWiseSumSalary(employees, "developer");
		System.out.println("total hr sum salary"+hrSumSalary);
	}	
//	dept wise details
//	find min salary and max salary
	/**
	 * 
	 * Description: this method to find sum salary of dept wise
	 * method name : deptWiseSumSalary
	 * @param employee
	 * @param dept
	 * @return sum Salary
	 * 
	 */

	Long deptWiseSumSalary(ArrayList<Employee> employee, String dept)
	{
		long sumSal=employee.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		return sumSal;
	}
	
}
