package com.careerit.cj.day10;

import java.util.Arrays;

public class RotateLeft {

	public static void main(String[] args) {

		int[] rotatedArr = rotate(new int[] { 1, 2, 3, 4, 5 }, 3);
		System.out.println(Arrays.toString(rotatedArr));
		
	}

	public static int[] rotate(int[] arr, int size) {

		for (int l = 1; l <= size; l++) {
			int temp = arr[0];
			int i;
			for (i=0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
}
