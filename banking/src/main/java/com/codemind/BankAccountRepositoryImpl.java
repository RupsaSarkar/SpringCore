package com.codemind;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return BankAccount.getAccountBalance();
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		return newBalance;
	}
	

}
