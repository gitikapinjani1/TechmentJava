package com.techment.ExceptionAssisment;

import java.time.LocalDate;
import java.util.Scanner;

class AgeCalculator {

	private int age;

	int calculateAge(String dob) throws InvalidDob {
		
	int date = Integer.parseInt(dob.substring(0, 2));
	int month = Integer.parseInt(dob.substring(3, 5));
	int year = Integer.parseInt(dob.substring(6, 10));
	

  int today = LocalDate.now().getYear();
	
	
	//System.out.println(date +" "+month+" "+year);
		
	if(dob.length()==10 && date>0 && date<=31 && month>0 && month <=12 && year>1111 && dob.charAt(2)=='/' && dob.charAt(5)=='/')
	{
		return today-year;
	}else
		throw new InvalidDob("invalid age");	
	}
}


class InvalidDob extends Exception{
	
	public InvalidDob(String msg)
	{
		super(msg);
	}
}


public class Ques3 {

	public static void main(String[] args) throws InvalidDob {

		try {
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter dob in dd/mm/yyyy ");
			String dob = scanner.next();

			AgeCalculator obj = new AgeCalculator();

			System.out.println(obj.calculateAge(dob));
			
		}catch(InvalidDob e)
		{
			System.out.println(e.getMessage());
		}

	}

}
