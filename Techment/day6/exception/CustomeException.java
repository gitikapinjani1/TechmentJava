package com.Techment.day6.exception;

class LateException extends Exception{
	
	public LateException(String msg) {
		super(msg);
	}
	
}

class Student {
	void login(int time) throws LateException {
		if(time >9)
			System.out.println("You are absent");
		else
			System.out.println("You are present.");
	}
}




public class CustomeException {

	public static void main(String[] args) throws LateException {
	
		//Account account = new Account();
		Student student = new Student();
		try {
	       
			student.login(10);
	       
		}catch(InSufficientFundException e)	{
			System.out.println(e.getMessage());
		}
	}

}
