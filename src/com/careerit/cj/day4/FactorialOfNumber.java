package com.careerit.cj.day4;

import java.util.Scanner;

public class FactorialOfNumber {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the N value :");
			int N = sc.nextInt();
			
			int fact = 1;
			for(int i=N;i>=2;i--) {
				fact = fact * i;
				
			}
			System.out.println("Factorial of "+N+" is "+fact);
			sc.close();
			
			
		}
}
