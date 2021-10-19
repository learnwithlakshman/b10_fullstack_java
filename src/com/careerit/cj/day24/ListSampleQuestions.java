package com.careerit.cj.day24;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;


class X implements Consumer<String>{

	@Override
	public void accept(String t) {

			System.out.println(t);
		
	}
	
}

class Y implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.startsWith("A");
	}
	
}

class Z implements BiFunction<String, String, String>{

	@Override
	public String apply(String t, String u) {
		return t.concat(" ").concat(u);
	}
	
}

public class ListSampleQuestions {

		public static void main(String[] args) {
			
				
				Predicate<String> p = t -> t.startsWith("A");		
					
				BiFunction<String, String, String> b = (u,t)->t.concat(" ").concat(u);
															 
			
				String data1 = "91,92,93,94,95,96,97,98,99,100";
				String data2 = "11,12,15,19,29,35,45,55,65,75,77,97,99";
			
				List<Integer> list = new ArrayList<Integer>();
				
				String[] arr1 = data1.split(",");
				String[] arr2 = data2.split(",");
				
				for(String ele:arr1) {
					list.add(Integer.parseInt(ele));
				}
				
				for(String ele:arr2) {
					list.add(Integer.parseInt(ele));
				}

				List<Integer> evenList = new ArrayList<Integer>();
				
				for(Integer ele:list) {
					if(ele % 2 == 0) {
						evenList.add(ele);
					}
				}
				System.out.println(evenList);
		}
}
