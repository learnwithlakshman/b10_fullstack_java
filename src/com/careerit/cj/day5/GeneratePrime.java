package com.careerit.cj.day5;

import java.util.Scanner;

public class GeneratePrime {

		public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the lb: ");
				int lb = sc.nextInt();
				System.out.println("Enter the ub: ");
				int ub = sc.nextInt();
				int count = 0;
				for(int i=lb;i<=ub;i++) {
					if(isPrime(i)) {
						System.out.print(i+" ");
						count++;
					}
				}
				System.out.println("\nTotal prime in range :"+lb+" and "+ub +" is "+count);
				
				sc.close();
			
		}
		
		private static boolean isPrime(int num) {

			if(num < 2)
				return false;
			
			for(int i=2;i<=num/2;i++) {
				if(num % i == 0) {
					return false;
				}
			}
			
			return true;
		
		}
		
		
}
