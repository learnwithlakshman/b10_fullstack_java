package com.careerit.cj.day23;

import java.io.IOException;

class E1Exception extends Exception{
	
}

class E2Exception extends E1Exception{
	
}
class E3Exception extends E2Exception{
	
}


class M1{
	void m1() throws E2Exception {
		
	}
}
class M2 extends M1{
	@Override
	void m1() throws E3Exception {
		
	}
}


public class Manager {

	public static void main(String[] args) {

		Account acc1 = new SavingsAccount("Krish", 5000);
		Account acc2 = new SavingsAccount("Charan", 5000);
		Account acc3 = new CurrentAccount("JP", 500000);
		Account acc4 = new SavingsAccount("Manoj", 15000);
		Account acc5 = new CurrentAccount("LWL", 50000);
		Account[] accounts = new Account[] { acc1, acc2, acc3, acc4, acc5 };

		for (Account acc : accounts) {
			acc.showBalance();
		}

		try {
			acc1.withdraw(50000);
		} catch (InsufficientFundsException e) {
				e.printStackTrace();
		}
	}
}
