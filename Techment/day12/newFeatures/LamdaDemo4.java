package com.techment.day12.newFeatures;

interface Largest{
	
	String largest(int a,int b,int c);
	
}

public class LamdaDemo4 {

	public static void main(String[] args) {

		Largest large=(a,b,c)->
		{
			if(a>b&&a>c)
				return "a is greater";
			else if (b>a&&b>c)
				return "b is greater";
			return "c is greater";
		};
		
		System.out.println(large.largest(10, 20, 30));
		
	}

}
