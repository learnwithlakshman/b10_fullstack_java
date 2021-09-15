package com.careerit.cj.day10;

public class ArrayPalindrome {

	public static void main(String[] args) {
		
			System.out.println(palindrome(new int[] {1,2,2,1}));

			System.out.println(palindrome(new int[] {1,2,1,9}));

			System.out.println(palindrome(new int[] {1,2,2,2,1}));
	}

	public static boolean palindrome(int[] arr) {

		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			if (arr[i] != arr[j]) {
				return false;
			}
		}

		return true;
	}
}
