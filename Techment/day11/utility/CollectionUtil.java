package com.Techment.day11.utility;

import java.util.HashMap;
import java.util.Map;

import com.Techment.day11.modal.Employee;

public class CollectionUtil {
	
	static Map<Integer, Employee> employees=new HashMap<Integer, Employee>();
	
	static{
		employees.put(1, new Employee(1,"john","hr",340000));
		employees.put(2, new Employee(2,"sachin","developer",340000));
		employees.put(3, new Employee(3,"manish","manager",340000));
		employees.put(4, new Employee(4,"amit","hr",340000));
		
	}
	//this method is used to get employee map, which we initialize as ststic data
	public static Map<Integer, Employee> getEmployeeList()
	{
		return employees;
	}
	
}
