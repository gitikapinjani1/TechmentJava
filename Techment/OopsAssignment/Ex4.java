package com.Techment.OopsAssignment;

class Address1{
	private String addressLine;
	private String city;
	
	public Address1(String addressLine, String city) {
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

class Customer1{
	private String customerName;
	private Address1 residentalAddress;
	Address1 officialAddress;
	
	Customer1(){
		
	}
	public Customer1(String customerName, Address1 residentalAddress,Address1 officialAddress) {
		this.customerName = customerName;
		this.residentalAddress = residentalAddress;
		this.officialAddress=officialAddress;
	}

	public Address1 getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(Address1 officialAddress) {
		this.officialAddress = officialAddress;
	}

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Address1 getResidentalAddress() {
		return residentalAddress;
	}


	public void setResidentalAddress(Address1 residentalAddress) {
		this.residentalAddress = residentalAddress;
	}
	
	String getCustomerDetail(){
		return "Customer : "+ customerName +"\n Residental Address : "+ residentalAddress.getAddressDetails()+"\nOfficial Address : "+officialAddress.getAddressDetails();
	}
	
	
	
}

public class Ex4 {

	public static void main(String[] args) {
			
		Address1 Raddress=new Address1("Ist Main HSR Layout","Banglore");
		Address1 Oaddress=new Address1("Ist Main Electronic City","Banglore");
		Customer1 cust=new Customer1("gitika",Raddress,Oaddress);
		
		System.out.println(cust.getCustomerDetail());
		
	}

}
