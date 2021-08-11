package com.Techment.day7.Collections;
import java.util.ArrayList;

public class UserDefineType {

	public static void main(String[] args) {
		
		Employee emp1 =new Employee(1,"sachin", "hr");
		Employee emp2 =new Employee(2,"ravi", "hr");
		
		ArrayList<Employee> employees =new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee(3,"sourabh", "developer"));
		
		
		for(Employee emp:employees)
		{
			if(emp.id>2)
				emp.dept="manager";
			System.out.println(emp.id+" "+ emp.getName()+" "+ emp.getDept());	
		}
		
		
		
	}

}
