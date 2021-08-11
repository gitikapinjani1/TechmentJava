package com.Techment.day6.exception;

class AgeException extends RuntimeException{
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}
	
	
}

class IdNotFoundException extends Exception{
	
	String msg;

	public IdNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
}



public class CustomException {

	public static void main(String[] args) throws IdNotFoundException  {
		// TODO Auto-generated method stub
      
		/*
		 * IdNotFoundException give exception because it is complile time exception(checked exception).
		 *  It can handle by try-catch block or by "throws" declare custome IdNotFoundException class
		 *   i.e. IdNotFoundException
		*/
		throw new IdNotFoundException("Not a valid age.");
      
      
	}

}

