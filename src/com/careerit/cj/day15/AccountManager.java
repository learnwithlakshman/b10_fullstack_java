package com.careerit.cj.day15;

import java.util.Arrays;

public class AccountManager {

		public static void main(String[] args) {
			
				Account obj1 = new Account("Krish",45000);
				Account obj2 = new Account("Naresh","9876543210",58000);
				
				obj1.showInfo();
				obj2.showInfo();
			
				System.out.println(isEven(17));
				
				int a = 10;
				int b = 20;
				System.out.println("A = "+a+" B ="+b);
				swap(a,b);
				System.out.println("A = "+a+" B ="+b);
				
				int[] eleArr = new int[] {1,2,3,4,5};
				increment(eleArr);
				System.out.println(Arrays.toString(eleArr));
		}
		
		public static boolean isEven(int num) {
			return num % 2 == 0;
		}
		
		public static void swap(int x,int y) {
			int t = x;
			x = y;
			y = t;
			System.out.println("A = "+x+" B ="+y);
		}
		
		public static void increment(int[] arr) {
			
				for(int i=0;i<arr.length;i++) {
					arr[i] = arr[i]+5;
				}
				
				System.out.println(Arrays.toString(arr));
		}
		
		
}
