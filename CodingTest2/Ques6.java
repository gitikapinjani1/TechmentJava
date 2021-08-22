package com.techment.CodingTest;

import java.util.Scanner;

class Person{
	
	int id;
	String name;
	int age;
	
}

class AgeException extends Exception{
	
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
		System.out.println(msg);
	}
}

class NameException extends Exception{
	
	String msg;

	public NameException(String msg) {
		super();
		this.msg = msg;
		System.out.println(msg);
	}
}

public class Ques6 {

	public static void main(String[] args) throws AgeException, NameException {
		
		Scanner scanner=new Scanner(System.in);
		Person person=new Person();
		
		System.out.println("Enter id");
		person.id=scanner.nextInt();
		
		System.out.println("Enter name");
		person.name=scanner.next();
		
		System.out.println("Enter age");
		person.age=scanner.nextInt();
		
		
		if(person.age<15)
		{
			throw new AgeException("Age should be greater than 15");
		}
		else
		{
			System.out.println("yaaaaa.....");
		}	
		
		if(person.name.length()<3)
		{
			throw new NameException("name should be greater than 3 words");
		}
		else {
			System.out.println("okkkk....");
		}
	}

}
