package com.careerit.cj.day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ListSortExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(40);
		list.add(60);
		
		//list.sort((a,b)->b.compareTo(a));
		//Collections.sort(list,(a,b)->b.compareTo(a));
		
	
		//Collections.sort(list,Collections.reverseOrder());
		
		list.sort(Collections.reverseOrder());
		System.out.println(list);
		
		

	}
}
