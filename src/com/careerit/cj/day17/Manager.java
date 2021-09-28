package com.careerit.cj.day17;

public class Manager {
	
		static {
			System.out.println("static - block");
		}
		{
			System.out.println("IIB");
		}
		public static void main(String[] args) {
			Manager obj = new Manager();
		}
		
		static {
			System.out.println("static - block");
		}
}
