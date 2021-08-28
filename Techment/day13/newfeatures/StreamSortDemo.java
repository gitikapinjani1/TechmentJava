package com.techment.day13.newfeatures;

import java.util.ArrayList;
import java.util.Comparator;

import com.techment.day12.newFeatures.Employee;

class AgeComparator implements Comparator<Employee>
{
	public int compare(Employee o1,Employee o2) {
		if(o1.getAge()>o2.getAge())
			return 0;
		else if(o1.getAge()>o2.getAge())
			return 1;
		return -1;
	}
}

public class StreamSortDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "sachin", "developer", 120000, 38));
		employees.add(new Employee(2, "kumar", "hr", 45000, 28));
		employees.add(new Employee(3, "anil", "hr", 55000, 24));
		employees.add(new Employee(4, "john", "manager", 84000, 32));
		employees.add(new Employee(5, "rahul", "hr", 60000, 27));
		employees.add(new Employee(6, "sourab", "developer", 70000, 27));
		
		employees.forEach(System.out::println);
		System.out.println();
		
		employees.parallelStream().sorted(new AgeComparator()).forEach(System.out::println);
		System.out.println();
		
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
		System.out.println();
		
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);
		System.out.println();
		
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		
		
	}

}
