package com.Techment.day6.exception;

import java.io.FileNotFoundException;

public class CheckedandUnchecked {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
/*
 * ArithmeticException not throw error because it is RuntimeException(unchecked).
 */
		//throw new ArithmeticException("some thing went wrong.");
		
	
		//throw new FileNotFoundException("File is not found.");
	
	/*
	 * FileNotFoundException give exception because it is complile time exception
	 *  It can handle by try-catch block or by "throws" declare exception class i.e. FileNotFoundException
	*/
		
		try {
			throw new FileNotFoundException("File is not found.");
				
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		
	}

}
