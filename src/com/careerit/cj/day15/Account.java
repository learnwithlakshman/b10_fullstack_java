package com.careerit.cj.day15;

import java.util.UUID;

public class Account {

		private String accNumber;
		private String name;
		private String mobile;
		private double balance;
		
		public  Account(String name,double balance) {
			this(name,"N/A",balance);
		}
		
		public  Account(String name,String mobile, double balance) {
			this.accNumber = UUID.randomUUID().toString();
			this.name = name;
			this.balance = balance;
			this.mobile = mobile;
		}
		
		public void showInfo() {
			System.out.println("Acc number  :" + accNumber);
			System.out.println("Name        :" + name);
			System.out.println("Mobile      :" + mobile);
			System.out.println("Balance     :"+balance);
		}
		
}


