package com.careerit.cj.day6;

import java.util.Scanner;

public class MultiplicationOfTable {

	
		public static void main(String[] args) {
			
			int start = 1;
			int end = 20;
			
			for(int j=start;j<=end;j++) {
				int num = j;
				for(int i=1;i<=10;i++) {
					System.out.println(num+" * "+i+" = "+(num*i));
				}
				System.out.println("*".repeat(15));
			}
			
			
		}
}
