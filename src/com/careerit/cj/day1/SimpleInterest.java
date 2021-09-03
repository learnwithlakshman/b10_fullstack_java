package com.careerit.cj.day1;

import java.util.Scanner;

/*
 * Write a program to find the simple interest based on the following data: P = Rs 6000, R = 10%, T = 1.5 years.
 */
public class SimpleInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of P:");

		float p = sc.nextFloat();
		System.out.println("Enter the value of R:");
		float r = sc.nextFloat();
		System.out.println("Enter the value of T");
		float t = sc.nextFloat();
		
		float si = (p * t * r )/100;
		System.out.println("The simple interest for amount (Rs) :"+p+" time (Years)"+t+" and rate (%):"+r+" is (Rs)"+si);
		sc.close();
	}
}
