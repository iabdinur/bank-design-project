package com.iabdinur.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class AccountController {
	
	List<Customer> customers = new ArrayList<>();
	List<Account> accounts = new ArrayList<>();
	
	public Customer createCustomer(String name, String address, String type) {
		if (type.equalsIgnoreCase("Person")) {
			Person person = new Person(name, address);
			customers.add(person);
			return person;
		}

		else if (type.equalsIgnoreCase("Company")) {
			Company company = new Company(name, address);
			customers.add(company);
			return company;
		}
		return null;
	}
	
	public Account createAccount(Customer customer, String type) {
		if (type.equalsIgnoreCase("Checking")) {
			CheckingAccount checkingAccount = new CheckingAccount();
			accounts.add(checkingAccount);
			customer.addAccount(checkingAccount);
			return checkingAccount;
		}

		else if (type.equalsIgnoreCase("Savings")) {
			SavingsAccount savingsAccount = new SavingsAccount();
			accounts.add(savingsAccount);
			customer.addAccount(savingsAccount);
			return savingsAccount;
		}
		return null;
	}	
	
	public void removeCustomer(Customer customer) {
		 customers.remove(customer);
		 for (Account account : customer.getAccounts()) {
				accounts.remove(account);
			}
	}
	
	public void removeAccount(Account account) {
		accounts.remove(account);
		for (Customer customer : customers) {
			customer.getAccounts().remove(account);
		}
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}
}
