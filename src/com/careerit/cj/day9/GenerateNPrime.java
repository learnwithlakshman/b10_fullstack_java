package com.careerit.cj.day9;

import java.util.Arrays;

public class GenerateNPrime {

	public static void main(String[] args) {
		int[] primes = generatePrime(1000);

		System.out.println(Arrays.toString(primes));
	}

	private static int[] generatePrime(int N) {
		int[] arr = new int[N];
		int c = 0;
		for (int i = 2;; i++) {
			if (isPrime(i)) {
				arr[c++] = i;
			}
			if (c == N)
				break;
		}
		return arr;
	}

	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
