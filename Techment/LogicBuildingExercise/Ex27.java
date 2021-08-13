package com.Techment.LogicBuildingExercise;
import java.util.Random;
public class Ex27 {

	public static void main(String[] args) {
		Random random=new Random();
		int i=random.nextInt(6);
		int j=random.nextInt(6);
		
		if(i%2==0&&j%2==0)
			System.out.println("Points="+i+j);
		else
			if(i>j)
				System.out.println("Points="+(i-j));
			else
				System.out.println("Points="+(j-i));
	}

}
