package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex13 {

	public static void main(String[] args) {
		int quan[]=new int[10];
		int max;
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<10;i++)
		quan[i]=scanner.nextInt();
		max=quan[0];
		for(int i=1;i<10;i++){
			if(max<quan[i])
				max=quan[i];
		}
		System.out.println(" max value is "+max);
	}
	

}
