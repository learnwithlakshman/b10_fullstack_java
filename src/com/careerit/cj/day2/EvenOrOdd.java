package com.careerit.cj.day2;

import java.util.Scanner;

public class EvenOrOdd {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num: ");
			int num = sc.nextInt();
			if(num % 2 == 0) {
				System.out.println(num+" is EVEN");
			}else {
				System.out.println(num+" is ODD");
			}
			sc.close();
		}
}
