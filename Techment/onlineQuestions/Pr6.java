package com.Techment.onlineQuestions;

import java.util.Scanner;

public class Pr6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num;
		int sum=0;
		int low;
		int high;
		int secondHigh;
		System.out.println("how many marks you want to enter");
		num=scanner.nextInt();
		int marks[]=new int[num];
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=scanner.nextInt();
		}
		System.out.println("Marks are :- ");
		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
			sum=sum+marks[i];
		}
		System.out.println("Sum of marks = "+ sum);
		low=marks[0];
		high=marks[0];
		for(int i=1;i<marks.length;i++){
			if(low>marks[i])
				low=marks[i];
			if(high<marks[i])
				high=marks[i];		
			}
		System.out.println("Lowest marks = "+ low);
		System.out.println("Highest marks = "+ high);
		secondHigh=marks[0];
		for(int i=1;i<marks.length;i++){
			if(secondHigh<marks[i])
			{
				if(secondHigh>high)
				{
					secondHigh=marks[i];
				}
			}
		}
		System.out.println("secondHigh = "+secondHigh);
		
		
		
	}

}
