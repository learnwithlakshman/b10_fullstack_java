package com.careerit.cj.day12;

public class StringExample2 {

		public static void main(String[] args) {
			
			String str = "Hi how are you?";
			
			String data = str.substring(2, 7).trim().substring(1, 2).toUpperCase();
			System.out.println(data);
			
			String name = "krish";
			
			System.out.println(name.equals("krish"));
			System.out.println(name.equalsIgnoreCase("KRISH"));
			System.out.println(name.contains("sh"));
			System.out.println(name.startsWith("kri"));
			System.out.println(name.endsWith("sh"));
			
		}
}
