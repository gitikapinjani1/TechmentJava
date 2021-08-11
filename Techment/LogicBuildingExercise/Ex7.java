package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex7 {

	public static void main(String[] args) {
		int first,last;
		Scanner scanner=new Scanner(System.in);
		first=scanner.nextInt();
		last=scanner.nextInt();
		for(int i=first;i<=last;i++)
		{
			System.out.println("Soldiers number "+i);
		}
	}

}
