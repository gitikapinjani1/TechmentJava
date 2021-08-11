package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex15 {

	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int n,count=0;
			n=scanner.nextInt();
			int arr1[]=new int[n];
			int arr2[]=new int[n];
			for(int i=0;i<n;i++)
				arr1[i]=scanner.nextInt();
			for(int i=0;i<n;i++)
				arr2[i]=scanner.nextInt();
			for(int i=0;i<n;i++)
			{
				if(arr1[i]==arr2[i])
				count++;
			}
			if(count==n)
				System.out.println("Same arrays");
			else
				System.out.println("different arrays");
			
			
	}

}
