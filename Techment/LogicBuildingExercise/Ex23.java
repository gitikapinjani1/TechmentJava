package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex23 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean flag;
		int weight;
		int height;
		int bmi;
		char check;
		do{
			System.out.println("Enter your weight");
			weight=scanner.nextInt();
			System.out.println("Enter your height");
			height=scanner.nextInt();
			
			bmi=weight/(height*height);
			
			if(bmi<18.5)
				System.out.println("you are underweight");
			else if(bmi<25)
				System.out.println("you are normal");
			else if(bmi<30)
				System.out.println("you are overweight");
			else
				System.out.println("you are obese");
			
			System.out.println("------------------------------------------------------");
			System.out.println("if you want to add more people click Y otherwise click N");
			check=scanner.next().charAt(0);
			if(check=='Y')
				flag=true;
			else
				flag=false;
		}while(flag);
	}

}
