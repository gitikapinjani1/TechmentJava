package com.techment.ExceptionAssisment;

class Customer{
	
	private String custNo;
	private String custName;
	private String category;
	
	public Customer(String custNo, String custName, String category) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
	}

	public String getCustNo() {
		return custNo;
	}

	public String getCustName() {
		return custName;
	}

	public String getCategory() {
		return category;
	}
	
	
	
	
}

class InvalidInputException extends Exception{
	
	InvalidInputException(String msg)
	{
		super(msg);
		System.out.println(msg);
	}
}

public class Ques2 {
	

	public static void main(String[] args) throws InvalidInputException {
		
		Customer customer =new Customer("cbcd","gpeeh","gold");
		
		if(customer.getCustNo().startsWith("c") || customer.getCustNo().startsWith("C"))
		{
			if(customer.getCustName().length()>=4)
			{
				if(customer.getCategory()=="platinum"||customer.getCategory()=="gold"||customer.getCategory()=="silver")
				{
					System.out.println(customer.getCustNo());
					System.out.println(customer.getCustName());
					System.out.println(customer.getCategory());
				}
				else {
					throw new InvalidInputException("category available are gold platinum silver " );
				}
			}
			else
			{
				throw new InvalidInputException("Customer name length should be greater 4");
			}
		}
		else
		{
			throw new InvalidInputException("Customer number should start with c");
		}
		
		
		
	}

}
