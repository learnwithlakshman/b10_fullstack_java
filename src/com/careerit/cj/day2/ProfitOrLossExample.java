package com.careerit.cj.day2;

import java.util.Scanner;

/*
 * cost price and selling price of an item is input through the keyboard, 
 * write a program to determine whether the seller has made a profit or incurred a loss.
 * Also determine the quantum of profit or loss.
 */

public class ProfitOrLossExample {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Buying price: ");
			float buyingPrice = sc.nextFloat();
			System.out.println("Enter the Selling price: ");
			float sellingPrice = sc.nextFloat();
			
			if(buyingPrice < sellingPrice) {
				float profit = sellingPrice - buyingPrice;
				System.out.println("You have incurred profit of :"+profit);
			}else {
				float loss = buyingPrice - sellingPrice;
				System.out.println("You have incurred loss of :"+loss);
			}
			sc.close();
			
		}
}
