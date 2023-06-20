package com.iabdinur.bankDesignProject;

public abstract class Account {
	long ACCOUNT_ID;
	
	long nextAccountId;
	
	protected double balance;
	
	private static int ID_NUMBER = 1000; 
	
	public Account() {
		ACCOUNT_ID = ID_NUMBER;
		ID_NUMBER = ID_NUMBER + 5;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public double withdraw(double amount) {
		balance = balance - Math.abs(amount);
		return amount;	
	}
	
	public void correctBalance(double amount) {
		balance = amount; 
	}
	
	public long getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
