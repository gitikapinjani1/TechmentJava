package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex16 {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		if((num%8==0)||(num%3==0))
		System.out.println("It is divisible by both 8 and 3");
		else
			System.out.println("it is not divisible by 8 and 3");

}
}