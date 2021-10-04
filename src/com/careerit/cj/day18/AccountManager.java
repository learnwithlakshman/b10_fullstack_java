package com.careerit.cj.day18;

public class AccountManager {

		public static void main(String[] args) {
			
				Account acc = new Account("Naresh", 45000);
				acc.withdraw(5000);
				
				System.out.println("---------------------");
				acc.deposit(10000);
				
			
		}
}
