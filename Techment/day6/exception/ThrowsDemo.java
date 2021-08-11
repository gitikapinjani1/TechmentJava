package com.Techment.day6.exception;

import java.io.FileNotFoundException;

class Student1{
	void checkEligibility(int age) throws FileNotFoundException
	{
		if(age >= 18)
			System.out.println("You can apply for loan");
		else 
			throw new FileNotFoundException("You cannot apply for loan.");
	//FileNotFoundException is checked exception i.e. compile time exception
	}
	
}



public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		Student1 student = new Student1();
		student.checkEligibility(6);
		
		
	}

}