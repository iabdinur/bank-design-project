package com.iabdinur.bankDesignProject;

public class Person extends Customer {

	public Person(String name, String address) {
		super(name, address);
	}

	public void chargeAllAccounts(double amount) {
		for (Account account : accounts) {
			account.withdraw(amount);
		}
	}
}
