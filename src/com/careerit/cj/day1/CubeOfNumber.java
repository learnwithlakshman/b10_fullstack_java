package com.careerit.cj.day1;

import java.util.Scanner;

/*
 * Write a program to accept a number from the user and find the cube of that number (to the power 3).
 */
public class CubeOfNumber {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number to cube:");
			int num = sc.nextInt();
			
			double cube = Math.pow(num, 3);
			
			System.out.println("The cube of :"+num+" is "+cube);
			sc.close();
				
		}
}
