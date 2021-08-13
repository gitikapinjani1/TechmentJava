package com.Techment.LogicBuildingExercise;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int height=scanner.nextInt();
		int base=scanner.nextInt();
		int hypo=scanner.nextInt();
		hypo=hypo*hypo;
		if(hypo==(base*base)+(height*height))
			System.out.println("Rigth angled triangle");
		else
			System.out.println("Not a right angle triangle");
		
		
	}

}
