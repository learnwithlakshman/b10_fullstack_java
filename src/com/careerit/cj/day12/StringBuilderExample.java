package com.careerit.cj.day12;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		String str = "12345";
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb.reverse().toString().equals(str));
		
	}
}
