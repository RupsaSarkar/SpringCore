package com.codemind;

public class BankAccount {
	private static long accountId;
	private String accountHolderName;
	private String accountType;
	private static double accountBalance;
	public static long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		BankAccount.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public static double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		BankAccount.accountBalance = accountBalance;
	}
	

}
