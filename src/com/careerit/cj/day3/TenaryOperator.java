package com.careerit.cj.day3;

import java.util.Collections;
import java.util.List;

public class TenaryOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int big = (a > b && a > c) ? a : (b > c) ? b : c;
		System.out.println(big);
		List<String> list = List.of("hello");
		System.out.println(Collections.frequency(list, "hello"));
	}
}
