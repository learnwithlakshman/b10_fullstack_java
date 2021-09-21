package com.careerit.cj.day12;

import java.util.Arrays;


public class StringExample3 {

	public static void main(String[] args) {

		// System.out.println(Arrays.toString(showSubStrings("hello",3)));
		// System.out.println(Arrays.toString(showSubStrings("hello",2)));

		//System.out.println(isAnagram("CAT", "TAC"));
		//System.out.println(isAnagram("CAT", "TVC"));
		System.out.println(Arrays.toString(rotate(new int[] { 1, 2, 3, 4, 5 }, 1)));
		System.out.println(Arrays.toString(rotate(new int[] { 1, 2, 3, 4, 5 }, 2)));
		System.out.println(Arrays.toString(rotate(new int[] { 1, 2, 3, 4, 5 }, 3)));
		
//		System.out.println(Arrays.toString(generateNPrimes(5)));
//
//		System.out.println(Arrays.toString(generateNPrimes(10)));
//
//		System.out.println(Arrays.toString(generateNPrimes(15)));
	}

	// 1 data = "hello" n = 3 "hel","ell", "llo" n = 2 "he","el","ll","lo"
	public static String[] showSubStrings(String data, int n) {

		int count = data.length() - n + 1;
		String[] arr = new String[count];
		int c = 0;
		for (int i = 0; i <= data.length() - n; i++) {
			String str = data.substring(i, i + n);
			arr[c++] = str;
		}
		return arr;

	}

	// 2
	public static boolean isPalindrome(String str) {

		// 1

//		   for(int i=0,j=str.length()-1;i<=j;i++,j--) {
//			   if(str.charAt(i)!=str.charAt(j)) {
//				   return false;
//			   }
//		   }
//		   return true;

		// 2

		return new StringBuilder(str).reverse().toString().equals(str);
	}

//3
	public static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
	}

	// #4 if arr [1,2,3,4,5] and n = 2 output should be [3,4,5,1,2] if n = 3 then
	// [4,5,1,2,3]
	public static int[] rotate(int[] arr, int n) {
//
//		for (int i = 1; i <= n; i++) {
//			int temp = arr[0];
//			for (int j = 0; j < arr.length - 1; j++) {
//				arr[j] = arr[j + 1];
//			}
//			arr[arr.length - 1] = temp;
//		}
//
//		return arr;
		
		int[] carr = Arrays.copyOfRange(arr, 0, n);
		return carr;
	}
	
	

	// 5 If b all the elements present in array a then it should return true
	// otherwise false
	public static void subArray(int[] a, int[] b) {

		boolean flag = true;

		for (int i = 0; i < b.length; i++) {
			int ele = a[i];
			if (!searchElement(a, ele)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}

	}

	public static boolean searchElement(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return true;
			}
		}
		return false;
	}

	public static int[] generateNPrimes(int n) {
		int[] arr = new int[n];
		int c = 0;
		for (int i = 2;; i++) {

			if (isPrime(i)) {
				arr[c++] = i;
			}

			if (c == n) {
				break;
			}
		}
		return arr;

	}

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}