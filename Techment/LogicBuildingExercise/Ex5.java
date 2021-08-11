package com.Techment.LogicBuildingExercise;

import java.util.Scanner;


public class Ex5 {

	public static void main(String[] args) {
		int birthday;
		Scanner scanner=new Scanner(System.in);
		birthday=scanner.nextInt();
			switch(birthday)
			{
			case 1:
				System.out.println("Your birthday is at january");
				break;
			case 2:
				System.out.println("Your birthday is at febuary");
				break;
			case 3:
				System.out.println("Your birthday is at march");
				break;
			case 4:
				System.out.println("Your birthday is at april");
				break;
			case 5:
				System.out.println("Your birthday is at may");
				break;
			case 6:
				System.out.println("Your birthday is at june");
				break;
			case 7:
				System.out.println("Your birthday is at july");
				break;
			case 8:
				System.out.println("Your birthday is at august");
				break;
			case 9:
				System.out.println("Your birthday is at september");
				break;
			case 10:
				System.out.println("Your birthday is at october");
				break;
			case 11:
				System.out.println("Your birthday is at november");
				break;
			case 12:
				System.out.println("Your birthday is at december");
				break;
				default:
					System.out.println("not a valid month");
		}
	}

}
