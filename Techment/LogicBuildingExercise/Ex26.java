package com.Techment.LogicBuildingExercise;
import java.util.Random;
public class Ex26 {

	public static void main(String[] args) {
		
		Random random=new Random();
		int i=random.nextInt();
		int j=random.nextInt();
		
		if(i==j)
			System.out.println("Random Numbers are same");
		else
			System.out.println("random numbers are not same");
	}

}
