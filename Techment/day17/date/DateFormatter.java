package com.techment.day17.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

	public static void main(String[] args) {
		
		
		LocalDate today=LocalDate.now();
		
		DateTimeFormatter dft1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dft2=DateTimeFormatter.ofPattern("yyyy MMM dd");
		DateTimeFormatter dft3=DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		DateTimeFormatter dft4=DateTimeFormatter.ofPattern("MMM dd E");
		DateTimeFormatter dft5=DateTimeFormatter.ofPattern("MMM dd EEEE");

		System.out.println(today.format(dft1));
		System.out.println(today.format(dft2));
		System.out.println(today.format(dft3));
		System.out.println(today.format(dft4));
		System.out.println(today.format(dft5));
		
		
	}

}
