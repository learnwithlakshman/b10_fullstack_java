package com.careerit.cj.day2;

import java.util.Scanner;

public class BillAmountCalc {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the bill amount :");
			float billAmount = sc.nextFloat();
			
			float discount =  0;
			float netAmount = 0;
			
			if(billAmount > 10000) {
				discount = billAmount * 10 / 100;
			}else {
				discount = billAmount * 5 / 100;
			}
			netAmount = billAmount - discount;
			System.out.println("Bill amount :"+billAmount);
			System.out.println("Discount    :"+discount);
			System.out.println("Net amount  :"+netAmount);
			sc.close();
		}
}
