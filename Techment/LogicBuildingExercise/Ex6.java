package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex6 {

	public static void main(String[] args) {
		int a;
		char b;
		int c;
		int rel;
		System.out.println("enter equation");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.next().charAt(0);
		c=scanner.nextInt();
		if(b=='+')
		{
			rel=a+c;
			System.out.println("Answer = "+rel);
		}
		else if(b=='-')
		{
			rel=a-c;
			System.out.println("Answer = "+rel);
		}
		else if(b=='*')
		{
			rel=a*c;
			System.out.println("Answer = "+rel);
		}
		else if(b=='/')
		{
			rel=a/c;
			System.out.println("Answer = "+rel);
		}
		else if(b=='%')
		{
			rel=a%c;
			System.out.println("Answer = "+rel);
		}

	}

}
