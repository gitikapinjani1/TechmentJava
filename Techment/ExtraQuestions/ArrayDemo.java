package com.Techment.ExtraQuestions;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) { 
		
		int a[][]=new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				Scanner scanner =new Scanner(System.in);
				a[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Entered array elements are :- ");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(a[i][j]);
				
			}
		}
	}

}
