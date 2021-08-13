package com.Techment.LogicBuildingExercise;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {

		int pin;
		Scanner scanner=new Scanner(System.in);
		int flag=1;
		
		while(flag!=0)
		{
			System.out.println("Enter pin");
			pin=scanner.nextInt();
			if(pin==12345)
			{
				System.out.println("correct pin");
				flag=0;
			}
			else
				System.out.println("wrong pin");
		}
	}

}
