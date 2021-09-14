package com.careerit.cj.day8;

public class NumberOperations {

	public static void main(String[] args) {

		int num = 5;
		switch (++num) {
		case 6:
			System.out.println(6);
			break;
		case 5:
			System.out.println(5);
			break;
		case 7:
			System.out.println(7);
			break;
		default:
			System.out.println("Something");
		}
		
	}

}
