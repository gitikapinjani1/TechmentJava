package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {
		int year;
		Scanner scanner=new Scanner(System.in);
		year=scanner.nextInt();
		if(year%4==0&&year%100!=0)
			System.out.println("leap year");
		else if(year%400==0)
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
	}

}
