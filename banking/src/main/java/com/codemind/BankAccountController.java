package com.codemind;

public class BankAccountController {
	double withdrawn;
	double deposited;
	public double withdraw(long accountId,double balance) {
		withdrawn= balance-10000;
		System.out.println("Amount after withdrawal"+ withdrawn);
		return withdrawn;
		
	}
	public double deposit(long accountId,double balance) {
		deposited= balance+ 15000;
		System.out.println("Amount after deposit"+ deposited);
		return deposited;
		
	}
	public double getBalance(long accountId) {
		double amt=deposited - 10000;
		System.out.println("Balance Amount"+ amt);
		return amt ;
		
	}
	public boolean fundTransfer(long fromAccount, long toAccount,double amount) {
		System.out.println("Fund Transfered");
		return true;
		
	}
	
}
