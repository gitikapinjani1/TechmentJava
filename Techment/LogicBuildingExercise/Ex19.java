package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex19 {

	public static void main(String[] args) {
		int n;
		Scanner scanner =new Scanner(System.in);
		n=scanner.nextInt();
		int m=n-1,j;
		
		for(int i=1;i<=n;i++)
		{
			for(int x=1;x<i;x++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=n+1-i;j++){
				System.out.print(j);
				
			}
			for(int k=n-i;k>=1;k--)
				{
					System.out.print(k);
				}
			for(int x=1;x<i;x++)
				{
					
					System.out.print(" ");
				}
			System.out.println();
				
				
		}
		
		}
}