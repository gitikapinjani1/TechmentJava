package com.Techment.ExtraQuestions;

abstract class Bank1{
	void Eligiblity(){
		System.out.println("above 18 can open account");
	}
	abstract int rateOfInterest(int interestRate);
}
//when any class extends abstract class means , it need to provide the implementation of abstract
class Axis1 extends Bank1{
	
	int rateOfInterest(int interestRate){
		System.out.println("Axis "+ interestRate);
		return interestRate;
	}
}

class Kotak1 extends Bank1{
	
	int rateOfInterest(int interestRate){
		System.out.println("Kotak "+ interestRate);
		return interestRate;
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Bank1 bank=new Axis1();
		System.out.println(bank.rateOfInterest(6));
	}

}
