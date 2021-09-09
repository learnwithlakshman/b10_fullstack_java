package com.careerit.cj.day7;

public class NumberOperations {

	public static void main(String[] args) {
		int num = 1234;
		System.out.println(reverse(num));
		System.out.println(sumOfDigits(num));
		System.out.println(isPalindrome(num));
	}

	public static int singleDigitSum(int num) {

		while (num > 9) {
			num = num / 10 + num % 10;
		}
		return num;

	}

	public static boolean isAmstrong(int num) {

		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;
		}

		return sum == num;
	}

	public static boolean isPalindrome(int num) {
		int rev = reverse(num);
		return rev == num;
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		return rev;
	}

	public static int sumOfDigits(int num) {

		int sum = 0;

		while (num != 0) {
			int r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		return sum;
	}
}
