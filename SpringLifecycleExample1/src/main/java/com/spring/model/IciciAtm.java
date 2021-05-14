package com.spring.model;

public class IciciAtm {

	String welcomemsg;

	public void init() {
		System.out.println("ATM init method called. Connecting to bank's network.");
	}

	public void destroy() {
		System.out.println("ATM destroy method called. Disconnecting from bank's network.");
	}

	public String getWelcomemsg() {
		return welcomemsg;
	}

	public void setWelcomemsg(String welcomemsg) {
		this.welcomemsg = welcomemsg;
	}
}