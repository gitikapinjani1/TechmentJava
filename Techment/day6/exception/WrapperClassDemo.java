package com.Techment.day6.exception;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		int a =100;
		Integer b =a; //autoboxing
		
		int c = b.intValue(); //unboxing
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
