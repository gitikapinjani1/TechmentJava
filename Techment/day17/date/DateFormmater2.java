package com.techment.day17.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormmater2 {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		
		DateTimeFormatter full=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter longDate=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter medium=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter shortDate=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

		System.out.println(today.format(full));
		System.out.println(today.format(longDate));
		System.out.println(today.format(medium));
		System.out.println(today.format(shortDate));
		
		LocalDateTime todayDateTime = LocalDateTime.now();
		System.out.println("now timming "+todayDateTime);
		DateTimeFormatter fulltime=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		//System.out.println(todayDateTime.format(shortdate));
		
		
		ZonedDateTime date=ZonedDateTime.now();
				System.out.println(date);
		System.out.println(date.format(full));
		
		
		
		
		
	
	}

}
