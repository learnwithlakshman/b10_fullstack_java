package com.careerit.cj.day25;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;


public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			list.add(ThreadLocalRandom.current().nextInt(1001, 10000));
		}

		System.out.println(list);

		// 1. Get all numbers which are more 8000
		// 2. Get all even numbers
		// 3. Get numbers in range 2000-5000 only

		List<Integer> res = filter(list, (ele) -> ele > 8000);
		List<Integer> evenList = filter(list, (t) -> t % 2 == 0);
		List<Integer> blist = filter(list, (ele) -> ele >= 2000 && ele <= 5000);
		System.out.println(res);
		System.out.println(evenList);
		System.out.println(blist);
	}

	private static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
		List<Integer> tempList = new ArrayList<Integer>();
		for (Integer ele : list) {
			if (predicate.test(ele)) {
				tempList.add(ele);
			}
		}
		return tempList;
	}

}
