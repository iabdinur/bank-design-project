package com.iabdinur.bankDesignProject;

public class Company extends Customer {

	public Company(String name, String address) {
		super(name, address);
	}

	public void chargeAllAccounts(double amount) {
		for (Account account : accounts) {

			if (account instanceof CheckingAccount) {
				account.withdraw(amount);
			} else if (account instanceof SavingsAccount) {
				account.withdraw(2 * amount);
			}
		}
	}

}

