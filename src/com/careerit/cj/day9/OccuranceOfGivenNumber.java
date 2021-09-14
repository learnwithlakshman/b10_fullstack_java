package com.careerit.cj.day9;

public class OccuranceOfGivenNumber {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 6, 7, 8, 9, 8, 7, 6, 5, 6, 7, 8, 9 };
		int key = 18;
		int count = occurance(arr, key);
		System.out.println("The key " + key + " occurred in an array :" + count);
		System.out.println(biggest(arr));

		int[] numArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num1 = 1;
		int num2 = 3;
		int num3 = 5;
		
		// If three elements are present message should be "success" otherwise "fail"
		
		if(linearSearch(numArr, num1)!=-1 && linearSearch(numArr, num2)!=-1 && linearSearch(numArr, num3)!=-1) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
		
		// Print array elements in reverse order
		
		int[] evenArr = {2,4,6,8,10,12,14,16,18,20};
		
		for(int i=evenArr.length-1;i>=0;i--) {
			int num = evenArr[i];
			System.out.println(num);
		}
		
	}

	// If element is preset it should return position/index otherwise should return
	// -1
	private static int linearSearch(int[] arr, int ele) {

		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i]) {
				return i;
			}
		}
		return -1;

	}

	private static int biggest(int[] arr) {

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;

	}

	private static int smallest(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	private static int occurance(int[] arr, int ele) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				count++;
			}
		}
		return count;
	}
}
