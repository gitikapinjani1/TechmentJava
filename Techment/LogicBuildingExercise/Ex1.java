package com.Techment.LogicBuildingExercise;


import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		int a,res;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a>9&&a<100){
		res=(a/10)+(a%10);
		System.out.println(res);
		}
	}

}
