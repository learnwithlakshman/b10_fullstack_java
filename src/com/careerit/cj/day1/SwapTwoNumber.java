package com.careerit.cj.day1;

import java.util.Scanner;

/*
 * Write a program to accept two numbers from the user and swap their values. 
 * (Example: x=12, y=15; after swapping x=15, y=12)
 */
public class SwapTwoNumber {

		public static void main(String[] args) {
			
						
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the num1 :");
			int num1 = sc.nextInt();
			System.out.println("Enter the num2 :");
			int num2 = sc.nextInt();
			
			System.out.println("Before swap num1: "+num1+" and num2: "+num2);
			
//			int temp = num1;
//			num1 = num2;
//			num2 = temp;
			
			num1 = num1 * num2;
			num2 = num1 / num2;
			num1 = num1 / num2;
			
			System.out.println("After swap num1: "+num1+" and num2: "+num2);
			sc.close();	
		}
}
