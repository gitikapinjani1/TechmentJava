package com.Techment.day6.exception;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println("name: is divya");
		System.out.println("email: divya@gmail.com");
		//System.out.println(1 / 0);
		int[] arr = new int[5];
		try {

			System.out.println(1 / 1);
			arr[3] = 24;
			System.out.println(1 / 0);
			
		} catch (NullPointerException e) {
			System.out.println("Don't give zero");
		} catch (ArithmeticException ae) {
			System.out.println("Don't give zero");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array Size 5 give index between 0 to 4.");
		}
		System.out.println("contact: 7049559988");

	}

}
