package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		int day;
		Scanner scanner=new Scanner(System.in);
		day=scanner.nextInt();
		if(day>0&&day<31){
			if(day%2==0)
				System.out.println("Cars with even registration numbers are permitted today");
			else
				System.out.println("Cars with odd registration numbers are permitted today");
		}
		else{
			System.out.println("Invalid Input");
		}

	}

}
