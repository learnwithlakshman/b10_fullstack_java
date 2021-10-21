package com.careerit.cj.day27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001, "Krish");
		map.put(1002, "Sai");
		map.put(1003, "Sunny");
		map.put(1004, "Jayesh");
		map.put(1001, "Krishna T");
		
	
		// Get all the keys then get value of the key
		
		Set<Integer> set = map.keySet();
		for(Integer key:set) {
			String name = map.get(key);
			System.out.println(key +" "+name);
		}
		
		// Get all the values
		System.out.println("------------ Values---------------");
		Collection<String> values = map.values();
		for(String name:values) {
			System.out.println(name);
		}
		
		System.out.println("------------ Key and Value ---------------");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for(Entry<Integer, String> entry:entrySet) {
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		
		System.out.println("------------ using streams ------------");
		
		map.entrySet().stream().forEach(e->{
			System.out.println(e.getKey() +" "+e.getValue());
		});
	}
}
