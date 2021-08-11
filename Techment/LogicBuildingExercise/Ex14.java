package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex14 {

	public static void main(String[] args) {
		int quan[]=new int[10];
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<10;i++)
		quan[i]=scanner.nextInt();
		
		for(int i=0;i<10;i++){
				sum+=quan[i];
		}
		System.out.println(" sum value is "+sum);
	}
	

}
