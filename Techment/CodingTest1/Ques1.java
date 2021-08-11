package com.Techment.CodingTest1;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age[]=new int[10];
		int child=0;
		int adult=0;
		int seniorCitizen=0;
		
		for(int i=0;i<10;i++)
		{
		age[i]=scanner.nextInt();
		
		if(age[i]<18)
			child++;
		else if(age[i]<54)
			adult++;
		else
			seniorCitizen++;
		}
		
		System.out.println("Children : "+child);
		System.out.println("Adult : "+adult);
		System.out.println("Senior Citizen : "+seniorCitizen);
		
		
		
	}

}
