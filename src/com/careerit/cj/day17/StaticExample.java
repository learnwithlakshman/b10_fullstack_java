package com.careerit.cj.day17;


class Account{
	    static String bankName = "SBI";
		String accNumber;
		String name;
		String email;
		double balance;
		static int count =0;
		
		static {
			System.out.println("Static");
		}
		// IIB
		{
			System.out.println("IIB-1");
			count++;
		}
		{
			System.out.println("IIB-2");
		}
		public Account(String accNumber, String name, String email, double balance) {
			this.accNumber = accNumber;
			this.name = name;
			this.email = email;
			this.balance = balance;
			
		}
		
		public void showInfo() {
			System.out.println("Acc number  : "+accNumber);
			System.out.println("Name        : "+name);
			System.out.println("Email       : "+email);
			System.out.println("Balance     : "+balance);
		
		}
		
		
}

public class StaticExample {
		
		static int i = 10;
		static {
			int i = 100;
			System.out.println(i);
		}
		static {
			i++;
			System.out.println(i);
			
		}

		public static void main(String[] args) {
			
			System.out.println(i);
			
			Account acc1 = new Account("SB-10001", "Krish", "krish.t@gmail.com", 560000);
			Account acc2 = new Account("SB-10002", "RK", "rk.r@gmail.com", 600000);
			acc1.showInfo();
			acc2.showInfo();	
			
			System.out.println(Account.count);
		}
		
		static class InnerCls{
			
		}
}
