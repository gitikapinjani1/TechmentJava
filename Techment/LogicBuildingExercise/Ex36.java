package com.Techment.LogicBuildingExercise;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i+1;j++)
			{
				System.out.print(j);
			}
			for(int j=num-i+1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
