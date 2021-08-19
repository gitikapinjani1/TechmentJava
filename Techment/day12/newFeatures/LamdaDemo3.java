package com.techment.day12.newFeatures;

interface Calculation1{
	int add(int a,int b);
}

public class LamdaDemo3 {

	public static void main(String[] args) {

		Calculation1 calculation=(a,b)->a+b;
		
		Calculation1 calculation2=(a,b)->
		{
			if(a>b)
				return a;
			else
				return b;
						
		};
		
		System.out.println(calculation.add(2,5));
		System.out.println("largest of two num :"+calculation2.add(12, 4));
		
	}

}
