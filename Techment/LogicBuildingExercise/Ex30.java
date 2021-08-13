package com.Techment.LogicBuildingExercise;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		String message;
		Scanner scanner=new Scanner(System.in);
		message=scanner.nextLine();
		int a=message.length();
		int count=0;
		System.out.println(a);
		System.out.println(message.charAt(0));
		System.out.println(message.charAt(a-1));
		for(int i=0;i<a;i++)
		{
			if(message.charAt(i)=='a')
				count++;
		}
		System.out.println("No. of a present is "+count);
		
	}

}
