package com.Techment.day11.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.Techment.day11.modal.Employee;
import com.Techment.day11.utility.CollectionUtil;

public class EmployeeDaoImpl implements IEmployeeDao {
	
	CollectionUtil collectionUtil=new CollectionUtil();
	
	

	public Employee getEmployeeById(int id) {
		
        Map<Integer, Employee> empMap=collectionUtil.getEmployeeList();
        Employee employee=empMap.get(id);
        return employee;
	}

	public List<Employee> getEmployeeByDept(String dept) {
		
		//List is declared to store all the employee based on dept
		List<Employee> employeeList =new ArrayList<Employee>();
		
		//it returns map data which contains employee details
		Map<Integer, Employee> empMap=collectionUtil.getEmployeeList();
		
		for(Employee employee:empMap.values())
		{
			if(employee.getDept().equalsIgnoreCase(dept))
			{
				employeeList.add(employee);
			}
		}
		
		return employeeList;
	}

}
