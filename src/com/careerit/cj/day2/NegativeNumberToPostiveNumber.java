package com.careerit.cj.day2;

import java.util.Scanner;

public class NegativeNumberToPostiveNumber {

		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the num :");
				int num = sc.nextInt();
				
				if(num < 0) {
					num = -num;
				}
				
				System.out.println("Entered number is :"+num);
				sc.close();
		}
}
