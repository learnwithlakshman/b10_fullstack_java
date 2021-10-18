package com.careerit.cj.day24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListExample {

		public static void main(String[] args) {
			
			List<String> list = new ArrayList<String>();
			list.add("Krish");
			list.add("Sunil");
			list.add("Manoj");
			list.add("Charan");
			list.add("Jayesh");
			System.out.println(list);
			list.add(1, "Mahesh");
			System.out.println(list);
			System.out.println(list.get(3));
			System.out.println(list.size());
			System.out.println(list.isEmpty());
			System.out.println(list.contains("Sunil"));
			
			//Using for loop			
			for(int i=0;i<list.size();i++) {
				String ele = list.get(i);
				System.out.println(ele);
			}
			//Using for-each loop
			for(String ele:list) {
				System.out.println(ele);
			}
			
			
			// Using stream
			System.out.println("----------- Using Streams-----------");
			list
				.stream()
				.forEach(System.out::println);
		
			// Iterator
			System.out.println("---------- Using Iterator ----------");
			Iterator<String> itr = list.iterator();
			while(itr.hasNext()) { 
				String ele = itr.next();
				if(ele.equalsIgnoreCase("sunil")) {
					itr.remove();
				}
				System.out.println(ele);
			}
			
			System.out.println(list);
			
			// List Iterator
			System.out.println("---------- Using List Iterator ----------");
			ListIterator<String> listItr = list.listIterator();
			while(listItr.hasNext()) { 
				String ele = listItr.next();
				if(ele.equalsIgnoreCase("Krish")) {
					listItr.set("Lakshman");
				}
				System.out.println(ele);
			}
			
			while(listItr.hasPrevious()) {
				String ele = listItr.previous();
				System.out.println(ele);
			}
			
			System.out.println(list);
			
		}
		
		
		
		
}
