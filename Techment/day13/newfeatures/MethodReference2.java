package com.techment.day13.newfeatures;

interface Calculate{
	int add(int a,int b);
}


class CalculationUtil{
	int addition(int a,int b)
	{
		return a+b;
	}
	static int Substract(int a,int b)
	{
		return a-b;
	}
	
}
public class MethodReference2 {

	public static void main(String[] args) {
		
		Calculate calculation=(a,b)->a+b;
		System.out.println(calculation.add(2,4));
		
		Calculate calculation1=(a,b)->a-b;
		System.out.println(calculation1.add(7,4));
	
		CalculationUtil calculationUtil=new CalculationUtil();
		Calculate c1=calculationUtil::addition;
		System.out.println(c1.add(2, 4));

		Calculate c2=CalculationUtil::Substract;
		System.out.println(c2.add(2, 3));
		
	}

}
