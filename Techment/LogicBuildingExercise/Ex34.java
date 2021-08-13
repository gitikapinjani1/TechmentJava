package com.Techment.LogicBuildingExercise;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
