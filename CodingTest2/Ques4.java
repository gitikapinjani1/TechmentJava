package com.techment.CodingTest;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		
		System.out.println("Choose any one RED YELLOW GREEN");
		Scanner scanner=new Scanner(System.in);
		String light=scanner.nextLine();
		
		switch(light) {
		case "RED":
			System.out.println("Stop");
			break;
		case "YELLOW":
			System.out.println("ready");
			break;
		case "Green":
		    System.out.println("go");
		    break;
		default:
			System.out.println("wrong input");
		
			
		}
		
		
		
		
	}

}
