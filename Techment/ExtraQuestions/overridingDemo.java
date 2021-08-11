package com.Techment.ExtraQuestions;

class bank{
	public void rateOfInterest(){
		System.out.println("3% ");}
	
}
class sbi extends bank{
	public void rateOfInterest(){
		System.out.println("4% ");
	}
	
}
class axis extends bank{
	public void rateOfInterest(){
		System.out.println("7% ");
	}
	
}
public class overridingDemo {

	
	public static void main(String[] args) {
		sbi s=new sbi();
		axis a=new axis();
		s.rateOfInterest();
		a.rateOfInterest();
		
	}

}
