package com.careerit.cj.day12;

public class StringExample3 {

		public static void main(String[] args) {
			
				String s1 = new String("CoreJava");
				String s2 = new String("CoreJava");
				String s3 = s1;
				
				System.out.println(s3 == s1);
				System.out.println(s1.equals(s2));
		}
}
