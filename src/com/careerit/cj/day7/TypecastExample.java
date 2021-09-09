package com.careerit.cj.day7;

public class TypecastExample {

		public static void main(String[] args) {
				
			int n = 30;
			int c = 0;
			int i = 1;
			while(c <= n) {
				if(isPrime(i)) {
					c++;
					System.out.println(i);
				}
				i++;
			}
			
			
		}
		
		public static boolean isPrime(int num) {
			
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
