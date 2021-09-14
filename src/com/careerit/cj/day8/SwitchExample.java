package com.careerit.cj.day8;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2 :");
		int num2 = sc.nextInt();

		System.out.println("Enter the (+,-,*,/,%) operator :");
		String ope = sc.next();

		/*
		 * if(ope.equals("+")) { int res = num1 + num2;
		 * System.out.println(num1+" "+ope+" "+num2+" = "+res); }else
		 * if(ope.equals("-")) { int res = num1 - num2;
		 * System.out.println(num1+" "+ope+" "+num2+" = "+res); }else
		 * if(ope.equals("*")) { int res = num1 * num2;
		 * System.out.println(num1+" "+ope+" "+num2+" = "+res); }else
		 * if(ope.equals("/")) { int res = num1 / num2;
		 * System.out.println(num1+" "+ope+" "+num2+" = "+res); }else
		 * if(ope.equals("%")) { int res = num1 % num2;
		 * System.out.println(num1+" "+ope+" "+num2+" = "+res); }else {
		 * System.out.println("Wrong operator has been entered"); }
		 */
		switch (ope) {

		case "+":
			int res = num1 + num2;
			System.out.println(num1 + " " + ope + " " + num2 + " = " + res);
			break;
		case "-":
			res = num1 - num2;
			System.out.println(num1 + " " + ope + " " + num2 + " = " + res);
			break;
		case "*":
			res = num1 * num2;
			System.out.println(num1 + " " + ope + " " + num2 + " = " + res);
			break;
		case "/":
			res = num1 / num2;
			System.out.println(num1 + " " + ope + " " + num2 + " = " + res);

			break;
		case "%":
			res = num1 % num2;
			System.out.println(num1 + " " + ope + " " + num2 + " = " + res);
			break;
		default:
			System.out.println("Wrong operator has been entered");
		}
		sc.close();

	}
}
