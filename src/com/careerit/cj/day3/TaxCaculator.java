package com.careerit.cj.day3;

import java.util.Scanner;

public class TaxCaculator {

	
		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the income amount :");
				float income = sc.nextFloat();
				
				float taxAmount;
				
				if(income < 300000) {
					taxAmount = 0;
				}else if(income <=500000) {
					taxAmount = (income-300000) * 0.05f;
				}
				else if(income <=100000){
					taxAmount = (income-500000f) * 0.1f + (0.05f*200000);
				}else {
					taxAmount = ((income-10_00_000f) * 0.2f)+ (0.05f*2_00_000) + (0.1f*5_00_000);
				}
				
				System.out.println(taxAmount);
				sc.close();
		}
}
