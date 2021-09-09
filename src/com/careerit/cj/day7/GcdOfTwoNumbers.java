package com.careerit.cj.day7;

public class GcdOfTwoNumbers {

		public static void main(String[] args) {
			
				int a = 45;
				int b = 30;
				
				while(a != b) {
					
					if(a > b)
						a = a - b;
					else
						b = b - a;
				}
				System.out.println("GCD is :"+a);
		}
}
