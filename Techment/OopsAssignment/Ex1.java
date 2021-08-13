package com.Techment.OopsAssignment;

class Address{
	private String addressLine;
	private String city;
	
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	
	public String getAddressLine() {
		return addressLine;
	}
	
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	String getAddressDetails(){
		return addressLine + " , "+ city;
	}
	
}

class Customer{
	private String customerName;
	private Address residentalAddress;
	
	Customer(){
		
	}
	public Customer(String customerName, Address residentalAddress) {
		super();
		this.customerName = customerName;
		this.residentalAddress = residentalAddress;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Address getResidentalAddress() {
		return residentalAddress;
	}


	public void setResidentalAddress(Address residentalAddress) {
		this.residentalAddress = residentalAddress;
	}
	
	String getCustomerDetail(){
		return "Customer : "+ customerName +"\n Residental Address : "+ residentalAddress.getAddressDetails();
	}
	
	
	
}

public class Ex1 {

	public static void main(String[] args) {
		
		Address address1=new Address("Ist Main HSR Layout","Banglore");
		Customer cust1=new Customer();
		cust1.setCustomerName("Gitika Pinjani");
		cust1.setResidentalAddress(address1);
		
		System.out.println("Customer name : " +cust1.getCustomerName()+"\n Address : "+cust1.getResidentalAddress().getAddressLine()+", "+cust1.getResidentalAddress().getCity());
		
		
		Customer cust2=new Customer("vaibhav", address1);
		System.out.println(cust2.getCustomerDetail());
		
		
		
		
		
		
		
		
	}

}
