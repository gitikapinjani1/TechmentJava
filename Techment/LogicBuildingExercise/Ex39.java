package com.Techment.LogicBuildingExercise;

import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=scanner.nextInt();
			}
				
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=scanner.nextInt();
			}
				
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+b[i][j]+"  ");
			}
			System.out.println();
				
		}
		
		
		
		
	}

}
