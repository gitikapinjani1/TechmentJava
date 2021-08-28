package com.techment.day13.newfeatures;

interface  A{
	Student getStudenyDetails();
}

class Student{
	
	int id;
	String name;
	void display() {
		System.out.println("this is student info");
	}
	
}

public class ConstructorRefrence {

	public static void main(String[] args) {
		
		//using lambda expression
		A a=()->{
			Student s=new Student();
			return s;
		};
		
		//using lambda single line
		A a1=()->new Student();
		a1.getStudenyDetails().display();
		
		//using method refrence
		A obj=Student::new;
		
		obj.getStudenyDetails().display();
	}

}
