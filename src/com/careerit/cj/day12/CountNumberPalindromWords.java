package com.careerit.cj.day12;

public class CountNumberPalindromWords {
	
	
		public static void main(String[] args) {
			System.out.println(countPalindromeWords("Hello,1221,RAMA,Rajesh,Mom,dad,Bye",","));
		}
	
		// 
	
		public static int countPalindromeWords(String data,String sep) {
				int count =0;
				String[] arr = data.split(sep);
				for(String str:arr) {
					str = str.toLowerCase();
					if(isPalindrome(str)) {
						count++;
					}
	      		}
				return count;
		}
		
		public static boolean isPalindrome(String str) {
			return new StringBuilder(str).reverse().toString().equals(str);
		}
}
