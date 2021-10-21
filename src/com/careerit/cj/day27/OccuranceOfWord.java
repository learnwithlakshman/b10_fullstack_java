package com.careerit.cj.day27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OccuranceOfWord {

	public static void main(String[] args) {

		String data = "java is fun learning java is fun to have fun learn java";
		String[] arr = data.split(" ");

		Set<String> set = new HashSet<String>();
		for (String ele : arr) {
			set.add(ele);
		}

		for (String name : set) {
			int count = getCount(name, arr);
			System.out.println(name +" "+count);
			 
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String name:arr) {
			map.putIfAbsent(name, 0);
			map.put(name, map.get(name)+1);
		}
		System.out.println(map);

	}

	private static int getCount(String name, String[] arr) {
		int count = 0;
		for (String ele : arr) {
			if (ele.equals(name)) {
				count++;
			}
		}
		return count;
	}
}
