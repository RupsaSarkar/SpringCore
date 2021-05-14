package com.codemind;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Config.xml");  
	        BankAccountController b = (BankAccountController)applicationContext.getBean("bankaccountcontroller");
	        b.withdraw(BankAccount.getAccountId(),BankAccount.getAccountBalance());
	        b.deposit(BankAccount.getAccountId(),BankAccount.getAccountBalance());
	        b.getBalance(BankAccount.getAccountId());
	        b.fundTransfer(BankAccount.getAccountId(), BankAccount.getAccountId(), 2000);
	}

}