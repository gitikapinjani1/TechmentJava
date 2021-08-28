package com.techment.day15.InterThreadCommunication;

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		Account account=new Account();
		
		Thread t1=new Thread() {
			public void run() {
				System.out.println("after withdraw balance is"+account.withdraw(3000));
				
			}
			
		};
		Thread t2=new Thread() {
			public void run() {
				
				System.out.println(" after deposit balance is "+account.deposit(2000));
				account.deposit(3000);
				
			}
			
		};
		
		t1.setName("Atm");
		t2.setName("Bank");
		
		t1.start();
		t2.start();
		
		
	}

}
