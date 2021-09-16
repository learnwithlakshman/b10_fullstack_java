package com.careerit.cj.day11;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {

		String name = "COREJAVA";

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
		
		String str = "cat";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		
		System.out.println(Arrays.equals(new int[] {1,2,3}, new int[] {1,2,3}));
		System.out.println(arr);
		
		
		String data = "Krish,Manoj,Charan,Rajesh,Suresh,Jayesh,Rama Krishna,Naresh";
		
		String[] names = data.split(",");
		
		for(int i=0;i<names.length;i++) {
			String n = names[i];
			n = n.substring(0, 4).toUpperCase();
			System.out.println(n);
		}
		
		System.out.println("*".repeat(100));
		
		showSubStrings("abcdef", 2);
		
		
	}

	public static boolean isPalindrome(String str) {
		for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isAnagram(String a,String b) {
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
    	return Arrays.equals(arr1, arr2);
	}
	
	public static void showSubStrings(String data,int n) {
		
		for(int i=0;i<data.length()-n+1;i++) {
				String str = data.substring(i,i+n);
				System.out.println(str);
		}
	}
}
