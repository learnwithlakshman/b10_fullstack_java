package com.careerit.cj.day1;

import java.util.Scanner;

/*
 * Write a program to accept two numbers from the user and find their sum and average.
 */

public class SumAndAverageTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1 :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the num2 :");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		float avg = sum / 2.0f;
		
		System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
		System.out.println("The avg of "+num1+" and "+num2+" is "+avg);
		
		sc.close();
	}
}
