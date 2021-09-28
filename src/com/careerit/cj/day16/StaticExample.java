package com.careerit.cj.day16;

import static com.careerit.cj.day16.MathOperations.biggest;
import static com.careerit.cj.day16.MathOperations.sum;
import static java.lang.Math.abs;
import static java.lang.Math.round;
import static java.lang.System.out;
final class MathOperations {

	private MathOperations() {
	}
	public static double sum(int[] arr) {
		double res = 0;
		for (int ele : arr) {
			res += ele;
		}
		return res;
	}

	public static int biggest(int a, int b, int c) {
		return (a > b && a > c) ? a : (b > c) ? b : c;
	}
}



public class StaticExample {
	
	private static final double PI = 6.0d;
	
	
	public  static final void main(String... args) {
		
		System.out.println(Double.parseDouble(args[3]));
    	int res = biggest(10, 30, 25);
    	double sum = sum(new int[] {5,6,4,3,2,1});
		out.println(res);
		out.println(sum);
		
		out.println("Hello");
		out.println("Welcome");
		out.println(Math.PI);
		out.println(PI);
		out.println(Math.pow(2, 3));
		out.println(abs(-2));
		out.println(round(3.56));
		
	}
	
	public static double pow(double a,double b) {
		return a+ b;
	}

}
