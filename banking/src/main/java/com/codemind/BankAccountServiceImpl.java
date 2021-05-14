package com.codemind;

public class BankAccountServiceImpl implements BankAccountService {
	double withdrawn;
	double deposited;
	@Override
	public double withdraw(long accountId, double balance) {
		// TODO Auto-generated method stub
		
		 withdrawn= balance-10000;
		return withdrawn;
	}

	@Override
	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub
		 deposited= balance+ 15000;
		return deposited;
	}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return deposited - 10000 ;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount,double amount) {
		// TODO Auto-generated method stub
		return true;

	}

}
