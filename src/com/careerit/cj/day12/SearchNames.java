package com.careerit.cj.day12;

public class SearchNames {

		public static void main(String[] args) {
			
			String names = "Krish EC-EC-89,Manoj-IS-89,Charan-CS-90,Ramesh N-EC-98,Rajesh-CS-88,"
					+ "JAYESH CS-CS-56,Lakshman-EC-78,Sham-IS-89,Kiran-CS-85,John-IS-89";
			
			String str = "IS";
			
			String[] arr = names.split(",");
			
			for(String data: arr) {
				String[] a = data.split("-");
      			if(a[1].equals(str)) {
					System.out.println(data);
				}
			}
			
		}
}
