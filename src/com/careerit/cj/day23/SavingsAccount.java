package com.careerit.cj.day23;

public class SavingsAccount extends Account {

	double minBalance = 1000;
	public SavingsAccount(String name, double balance) {
		super(name, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if (amount <= (this.balance - minBalance)) {
			this.balance -= amount;
			String message = String.format("Your account %s has been debited with %s and current balance %s",
					maskAccnumber(), amount, balance);
			System.out.println(message);
		} else {
			throw new InsufficientFundsException("You don't sufficient funds please check! Your balance is :" + balance);
		}
	}

}
