package com.techment.day17.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		LocalDate birthdate=LocalDate.of(1999, 10, 19);
		Period period=Period.between(birthdate, today);
		
		System.out.println(period.getYears()+ " years"+ period.getMonths()+" months"+period.getDays()+" days");
		
		System.out.println(birthdate.isBefore(today));
		
		
		
	}

}
