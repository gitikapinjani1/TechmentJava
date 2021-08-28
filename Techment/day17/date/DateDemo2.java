package com.techment.day17.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo2 {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		System.out.println(today.plusYears(2).getDayOfWeek().toString().equals("WEDNESDAY"));
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println();
		
		System.out.println(today.minusYears(2).getDayOfWeek().toString().equals("WEDNESDAY"));

		
	}

}
