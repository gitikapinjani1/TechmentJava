package com.Techment.LogicBuildingExercise;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
		
	}

}
