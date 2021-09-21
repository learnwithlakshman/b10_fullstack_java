package com.careerit.cj.day13;

import java.util.UUID;

public class Account {
	
	private String accNumber;
	private String name;
	private double balance;

	public Account(String name, double balance) {
		this.accNumber = UUID.randomUUID().toString().toUpperCase();
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void showInfo() {
		String info = String.format("Account number %s, name %s and balance %s", accNumber, name, balance);
		System.out.println(info);
	}
}