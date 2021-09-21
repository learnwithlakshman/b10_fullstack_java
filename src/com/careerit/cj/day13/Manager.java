package com.careerit.cj.day13;

import java.util.UUID;



public class Manager {

	public static void main(String[] args) {

		Account acc1 = new Account("Naresh", 35000);
		acc1.showInfo();
		System.out.println("*".repeat(100));
		acc1.deposit(15000);
		acc1.withdraw(25000);
		acc1.showInfo();

		
	}
}
