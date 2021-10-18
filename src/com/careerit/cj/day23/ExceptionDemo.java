package com.careerit.cj.day23;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

//				String str = getMessage();
//				System.out.println(str.toUpperCase());

//		int[] arr = new int[] { 1, 2, 3 };
//		for (int i = 0; i <= arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		try(Scanner sc = new Scanner(System.in)) {
			String str = "Hello";
			System.out.println(str.charAt(10));
			try {
				
			}catch (Exception e) {
				
			}
		}catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			try {
				
			}catch (Exception e1) {
				// TODO: handle exception
			}
		}
		finally {
			System.out.println("Finally");
		 try {
			 
		 }catch (Exception e) {
			// TODO: handle exception
		}
		}
	}

	private static String getMessage() {

		return null;
	}
	
	public static int divide(int a,int b) throws IOException{
		if(b == 0)
			throw new ArithmeticException("Value of b can't be zero");
		return a / b;
	}
}
