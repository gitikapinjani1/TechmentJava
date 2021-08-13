package com.Techment.LogicBuildingExercise;

import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Size of matrix");
		
		int size=scanner.nextInt();

		int a[][]=new int[size][size];
		int b[][]=new int[size][size];
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				a[i][j]=scanner.nextInt();
			}
		}
		int k=size-1;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				b[i][j]=a[i][k-j];
			}
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
