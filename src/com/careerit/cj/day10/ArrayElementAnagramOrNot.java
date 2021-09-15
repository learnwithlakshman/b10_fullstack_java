package com.careerit.cj.day10;

import java.util.Arrays;

public class ArrayElementAnagramOrNot {

		public static void main(String[] args) {
			System.out.println(isAnagram(new int[] {1,2,3},new int[] {3,1,2}));
			System.out.println(isAnagram(new int[] {1,2,3},new int[] {3,1,1}));
			System.out.println(isAnagram(new int[] {2,1,3},new int[] {1,3,2}));
		}
	
		public static boolean isAnagram(int[] arr1,int[] arr2) {
			if(arr1.length != arr2.length) {
				return false;
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			return Arrays.equals(arr1,arr2);
		}
}
