package com.iabdinur.bankDesignProject;

import java.util.ArrayList;
import java.util.List;


public abstract class Customer {
	
	long CUSTOMER_ID;
	long nextCustomerId;
	String name;
	private String address;
	List<Account> accounts;
	
	private static int ID_NUMBER = 2000000;
	
	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		CUSTOMER_ID = ID_NUMBER;
		ID_NUMBER = ID_NUMBER + 7;
		accounts = new ArrayList<>();
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public void removeAccount(Account account) {
		accounts.remove(account);
		
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	
	public long getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
