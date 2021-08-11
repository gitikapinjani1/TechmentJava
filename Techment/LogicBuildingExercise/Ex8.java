package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex8 {

	public static void main(String[] args) {
		int num,res=0,n,num2;
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		num2=num;
		n=num%10;
		num=num/10;
		res+=n*n*n;
		n=num%10;
		num=num/10;
		res+=n*n*n;
		n=num%10;
		num=num/10;
		res+=n*n*n;
		if(res==num2)
		System.out.println(num2+" is armstrong number");
		else
			System.out.println(num2+" is not armstrong number");
	}
}
