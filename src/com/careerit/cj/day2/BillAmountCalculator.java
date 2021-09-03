package com.careerit.cj.day2;

import java.util.Scanner;

// Accept the bill amount from the user and if amount > 10000 then give the 10% discount
// Bill amount : 150000
// Discount: 1500
// Net amount: 13500
public class BillAmountCalculator {

		public static void main(String[] args) {
				
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the bill amount :");
			float billAmount = sc.nextFloat();
			
			float discount = 0;
			float netAmount = billAmount;
			
			if(billAmount > 10000) {
				discount = billAmount * 10 / 100;
				netAmount = billAmount -discount;
			}
			System.out.println("Bill amount :"+billAmount);
			System.out.println("Discount    :"+discount);
			System.out.println("Net amount  :"+netAmount);
			sc.close();
		}
}
