package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex3 {

	public static void main(String[] args) {
		int horse1,horse2,horse3;
		Scanner scanner=new Scanner(System.in);
		horse1=scanner.nextInt();
		horse2=scanner.nextInt();
		horse3=scanner.nextInt();
		if(horse1>horse2 && horse1>horse3)
			System.out.println("horse1 has highest weight");
		if(horse2>horse3 && horse2>horse1)
			System.out.println("horse2 has highest weight");
		if(horse3>horse2 && horse3>horse1)
			System.out.println("horse3 has highest weight");
		else
			System.out.println("Entered weight are not distinct values");
	}

}
