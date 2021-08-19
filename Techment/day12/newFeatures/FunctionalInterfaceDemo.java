package com.techment.day12.newFeatures;

interface Bank1{
	void rateOfInterface();
	default void display() {
		System.out.println("This is default method");
	}
	static void loan() {
		System.out.println("you can apply for loan");
	}
	
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
	}

}
