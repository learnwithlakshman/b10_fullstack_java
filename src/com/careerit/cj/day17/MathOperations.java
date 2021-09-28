package com.careerit.cj.day17;

import java.io.IOException;

public class MathOperations {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// var args
	public int add(int... ele) {

		int sum = 0;
		for (int e : ele) {
			sum += e;
		}
		return sum;
	}
	
	public static void main(String[] args) {
			MathOperations obj = new MathOperations();
			int res = obj.add(10);
			System.out.println("Result :"+res);
	}

}
