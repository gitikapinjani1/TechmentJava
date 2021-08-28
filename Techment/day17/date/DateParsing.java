package com.techment.day17.date;

import java.time.LocalDate;

public class DateParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String dob="19/10/1999";
		String joiningDate="2021-08-02";
		System.out.println(dob);
		System.out.println(joiningDate);
		
		System.out.println("==============================");
		
		/*
		 * parsing for joining date
		 */
		LocalDate joiningDateAfterParsing=LocalDate.parse(joiningDate);
		System.out.println(joiningDateAfterParsing);
		
		System.out.println(joiningDateAfterParsing.getYear());
		System.out.println(joiningDateAfterParsing.getMonth());
		
		System.out.println("==============================");
		
		System.out.println("=====Sample=====");
		
		LocalDate today=LocalDate.now();
		LocalDate joiningdate=LocalDate.parse(joiningDate);
		LocalDate birthdate=LocalDate.of(1999, 10, 19);
	}

}
