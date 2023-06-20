package com.iabdinur.bankDesignProject;

public class SavingsAccount extends Account {

	private double interestRate;

	public void addInterest() {
		double interest = balance * (interestRate / 100);
		balance = balance + interest;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		 this.interestRate = interestRate;
	}

	public double withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - Math.abs(amount);
			return amount;
		} else {
			return 0.0;
		}
	}
}