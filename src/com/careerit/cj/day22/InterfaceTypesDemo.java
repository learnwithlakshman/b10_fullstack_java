package com.careerit.cj.day22;

import java.io.Serializable;

@FunctionalInterface
interface MathOperation{
	
	int perform(int a,int b);
	
	default boolean isEven(int num)
	{
		return false;
	}
		
}

public class InterfaceTypesDemo {
	
		public static int reduce(int[] arr,MathOperation ope) {
			
				int res = arr[0];
				for(int i=1;i<arr.length;i++) {
					res = ope.perform(res, arr[i]);
				}
				return res;
				
		}
		
		public static void main(String[] args) {
			MathOperation add = (a,b)-> a + b;
			MathOperation mul = (a,b)-> a * b;
				
			int[] numArr = new int[] {1,2,3,4,5,6};
			
			int res = reduce(numArr, (a,b)->a+b);
			System.out.println(res);
			
		}
}
