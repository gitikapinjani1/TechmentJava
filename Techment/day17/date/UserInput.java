package com.techment.day17.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your DOB");
		String dob=scanner.next();
		System.out.println("your birthdate is "+dob);
		
		//DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yy/MMM/dd");
		LocalDate birthDate=LocalDate.parse(dob,dtf1);
		System.out.println("Birthday : "+birthDate);
		
		System.out.println("birthdate in given format "+ birthDate);
	}

}
