package com.careerit.cj.day26;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {

		String[] arr = "Krish,Manoj,Sunil,Rajesh,Krish,Charan,Jayesh,Manoj,Rajesh".split(",");

		Set<String> set = new HashSet<String>();
		for (String name : arr) {
			set.add(name);
		}
		System.out.println("--------- Using Foreach ----------------");
		for(String name:set) {
			System.out.println(name);
		}
		System.out.println("--------- Using Iterator ----------------");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
		}
		System.out.println("--------- Using Streams ----------------");
		set.stream().forEach(ele->{
			System.out.println(ele);
		});
		System.out.println(set);
	}
}
