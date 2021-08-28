package com.techment.day13.newfeatures;

interface LargeNumber{
	int largest(int a,int b,int c);
}

class CalculationUtil1{
	
	int findLargest(int a,int b,int c)
	{
		if(a>b&&a>c)
			return a;
		else if(b>a&&a>c)
			return b;
		return c;
	}
	
}


public class MethodReference3 {

	public static void main(String[] args) {
		
		LargeNumber largenumber=(a,b,c)->{
			if(a>b&&a>c)
				return a;
			else if(b>a&&a>c)
				return b;
			return c;
		};
		System.out.println(largenumber.largest(2,3,4));
		
		CalculationUtil1 largenumber2=new CalculationUtil1();
		LargeNumber number=largenumber2::findLargest;
		System.out.println(number.largest(2,4,8));
		
		
		
		
	}

}
