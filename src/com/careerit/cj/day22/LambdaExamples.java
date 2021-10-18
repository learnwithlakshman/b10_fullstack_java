package com.careerit.cj.day22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExamples {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 4, 5, 7, 11, 13, 15, 17, 19, 12, 3, 9);
		
		Predicate<Integer> p = (ele)->isPrime(ele);
		
		List<Integer> resList = search(list, p);
		System.out.println(resList);

	}

	private static boolean isPrime(Integer ele) {
		if(ele < 2)
			return false;
		for(int i=2;i<=ele/2;i++) {
			if(ele % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static List<Integer> search(List<Integer> list, Predicate<Integer> predicate) {

		List<Integer> tempList = new ArrayList<Integer>();
		for (Integer ele : list) {
			if (predicate.test(ele)) {
				tempList.add(ele);
			}
		}
		return tempList;
	}
}
