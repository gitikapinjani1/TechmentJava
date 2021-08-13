package com.Techment.LogicBuildingExercise;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {

		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=num-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}
