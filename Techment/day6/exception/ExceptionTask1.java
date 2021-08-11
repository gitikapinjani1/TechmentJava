package com.Techment.day6.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask1 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		try {
			System.out.println("Enter first Number");
			int num1 = scanner.nextInt();
			System.out.println("Enter Second Number");
			int num2 = scanner.nextInt();
			
			int result = num1/ num2;
			System.out.println("Result : "+result);
			
		}catch(ArithmeticException ae) 
		{
		System.out.println("Do not give zero.");	
		}catch(InputMismatchException e) {
			System.out.println("Do not give character, Enter number only.");
		}

		
	}

}
