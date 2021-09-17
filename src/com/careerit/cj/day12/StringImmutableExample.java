package com.careerit.cj.day12;

public class StringImmutableExample {

		public static void main(String[] args) {
			
				String s1 = "Corejava";
				String s2 = "Corejava";
				
				System.out.println(s1.concat(" world"));
				s1.concat(" 1");
				System.out.println(s1);
				System.out.println(s2);
		
		}
}
