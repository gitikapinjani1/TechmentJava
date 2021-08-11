package com.Techment.oops;


	class Customer{
		int custId;
		String custName;
		Account account;
		public Customer(int custId, String custName, Account account) {
			super();
			this.custId = custId;
			this.custName = custName;
			this.account = account;
		}
		
		void displayCustomerAccountDetails(){
			System.out.println("custId: "+custId);
			System.out.println("custName: "+custName);
			System.out.println("accountNo: "+account.accountNo);
			System.out.println("accountType: "+account.accountType);
			System.out.println("Balance: "+account.Balance);
			System.out.println("IFSC code: "+account.IFSC);
			System.out.println("Branch: "+account.Branch);
		}
	}
	class Account{
		int accountNo;
		String accountType;
		int Balance;
		String IFSC;
		String Branch;
		public Account(int accountNo, String accountType, int balance,String iFSC, String branch) {
			super();
			this.accountNo = accountNo;
			this.accountType = accountType;
			Balance = balance;
			IFSC = iFSC;
			Branch = branch;
		}
		
	}
public class main3 {

	public static void main(String[] args) {
		Account account=new Account(652530,"Current Account",10000,"SBIN232323","abc");
		Customer customer =new Customer(1, "Gitika Pinjani",account);
		customer.displayCustomerAccountDetails();
	}

}
