package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex9 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(i*i*i+", ");
		}
	}

}
