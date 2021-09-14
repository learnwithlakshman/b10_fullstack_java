package com.careerit.cj.day9;

import java.util.concurrent.ThreadLocalRandom;

public class SumAndAvgOfNumbers {

	public static void main(String[] args) {

		int[] arr = new int[10];
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			int num = ThreadLocalRandom.current().nextInt(10, 101);
			arr[i] = num;
		}
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			sum = sum + num;
			System.out.println(num);
		}
		
		double avg = sum/(double)arr.length;
		System.out.println(sum+"    Average :"+avg);
		
		
	}
}
