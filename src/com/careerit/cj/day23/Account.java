package com.careerit.cj.day23;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Account {

	String accNumber;
	String name;
	double balance;

	public Account(String name, double balance) {
		this.accNumber = Long.toString(ThreadLocalRandom.current().nextLong(100000001, 999999999));
		this.name = name;
		this.balance = balance;
	}

	public abstract void withdraw(double amount);

	public void deposit(double amount) {
		this.balance += amount;
		String message = String.format("Your account %s has been credited with %s and current balance %s",
				maskAccnumber(), amount, balance);
		System.out.println(message);
	}

	String maskAccnumber() {

		String maskAccnumber = "********" + this.accNumber.substring(this.accNumber.length() - 4);
		return maskAccnumber;

	}

	public void showBalance() {

		String message = String.format("Account %s has balance  %s ", maskAccnumber(), balance);
		System.out.println(message);
	}

}
