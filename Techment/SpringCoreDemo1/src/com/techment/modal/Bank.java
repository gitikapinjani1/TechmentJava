package com.techment.modal;

public class Bank {

	String bankName;
	String ifscCode;
	String branch;
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void displayBankDetails() {
		
		System.out.println("Name : "+bankName);
		System.out.println("IFSC cpde : "+ifscCode);
		System.out.println("Branch : "+branch);
	
	}
	
	
	
	
	
	
}
