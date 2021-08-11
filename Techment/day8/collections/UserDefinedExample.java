package com.Techment.day8.collections;

//deafult natural sorting:
//--------------------------
//comparable:
//	it is a single sorting
//	it will change the original object

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable <Employee>{
	int id;
	String name;
	String dept;
	int age;
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	public int compareTo(Employee o) {
		if(this.age>o.age)
			return 0;
		else if(this.age>o.age)
			return 1;
		else
			return -1;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept
				+ ", age=" + age + "]";
	}
	
	
	
}
public class UserDefinedExample {

	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1,"ramesh","hr",34));
		employees.add(new Employee(2,"ramesh","hr",67));
		employees.add(new Employee(3,"ramesh","hr",30));
		employees.add(new Employee(4,"ramesh","hr",42));
		
		for(Employee emp: employees){
			System.out.println(emp.id+" "+emp.name+" "+emp.dept+" "+emp.age);
		}
	
		Collections.sort(employees);
		System.out.println("after sorting");
		for(Employee emp : employees){
			System.out.println(emp.id+" "+emp.name+" "+emp.dept+" "+emp.age);
		}
		
		
	}

}




