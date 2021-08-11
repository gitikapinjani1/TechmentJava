package com.Techment.onlineQuestions;

class Customer{
	int id;
	String name;
	int contact;
	int minBalance;
	Customer(int id,String name,int contact,int minBalance)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.minBalance=minBalance;
	}
	
	void displayCustomerDetails()
	{
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("contact number = "+contact);
		System.out.println("minBalance = "+minBalance+ "\n");		
	}
	
	void accountType()
	{
		if(minBalance==0)
			System.out.println(name+" has zero balance");
		else if(minBalance>0 && minBalance<=1000)
			System.out.println(name+ " has Saving Account");
		else
			System.out.println(name+ " has Current Account");
	}
	
}
public class Pr7 {

	public static void main(String[] args) {
		Customer cust1=new Customer(1,"abc",989898,0);
		Customer cust2=new Customer(2,"xyz",979797,900);
		Customer cust3=new Customer(3,"pqr",969696,20000);
		cust1.displayCustomerDetails();
		cust2.displayCustomerDetails();
		cust3.displayCustomerDetails();
		cust1.accountType();
		cust2.accountType();
		cust3.accountType();
		
		
		
		
	}

}
