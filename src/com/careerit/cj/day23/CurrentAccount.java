package com.careerit.cj.day23;

public class CurrentAccount extends Account {

	private double overDraft=1_00_000;
	
	public CurrentAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public void withdraw(double amount) {
		
		if (amount <= (this.balance + overDraft)) {
			this.balance -= amount;
			String message = String.format("Your account %s has been debited with %s and current balance %s",
					maskAccnumber(), amount, balance);
			System.out.println(message);
		} else {
			System.out.println("You don't sufficient funds please check! Your balance is :" + balance);
		}
	}
}
