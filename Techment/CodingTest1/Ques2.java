package com.Techment.CodingTest1;

class Employee{
	String firstName;
	String secondName;
	public Employee(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", secondName="
				+ secondName + "]";
	}
	
}

public class Ques2 {

	public static void main(String[] args) {
		
		
		Employee e1=new Employee("gitika","pinjani");
		Employee e2=new Employee("vaibhav","agrawal");
		Employee e3=new Employee("riya","ahuja");
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
	}

}
