package com.techment.ExceptionAssisment;

public class Ques1{
	
	static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}

	public static void main(String args[])
	{
		
		if(args.length==0|| args.length==1)
		{
			throw new ArrayIndexOutOfBoundsException("No Input Received");
		}
		
		else {
			
			if(isInteger(args[0]) && isInteger(args[1]))
			{
				try {
				int num1=Integer.parseInt(args[0]);
				int num2=Integer.parseInt(args[1]);
				
				System.out.println("Result = "+num1/num2);
				}
				catch(ArithmeticException e){
					System.out.println(e.getMessage());
				}
			
			}
			
			else {
				throw new IllegalArgumentException("Only Integers are allowed");
			}
		}
		
	}
}