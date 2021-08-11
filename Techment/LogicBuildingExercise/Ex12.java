package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex12 {

	public static void main(String[] args) {
		int n;
		Scanner scanner =new Scanner(System.in);
		n=scanner.nextInt();
		int m=n-1,j;
		
		for(int i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++){
				if(j<=m)
				System.out.print(" ");
				else
					System.out.print(j);
			}
				for(int k=n-1;k>=1;k--)
				{
					if(k<=m)
						System.out.print(" ");
						else
							System.out.print(k);
				}
	
				System.out.println();
				m--;
		}
		
		}
}