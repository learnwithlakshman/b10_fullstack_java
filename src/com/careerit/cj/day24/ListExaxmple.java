package com.careerit.cj.day24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExaxmple {

		public static void main(String[] args) {
			
				List<String> cs = List.of("NV", "JA", "KV");
				List<String> is = List.of("NV", "CV","RM","MR","DR");
				List<String> ec = List.of("NV", "CV", "MV","JV","LV");
	
				List<String> list = new ArrayList<String>();
				Set<String> set = new HashSet<String>();
				set.addAll(ec);
				set.addAll(is);
				set.addAll(cs);
				
				list.addAll(set);
				System.out.println(list);
				
				// 
				
				List<Integer> numList = new ArrayList<Integer>();
				numList.add(0);
				numList.add(1);
				numList.add(101);
				numList.add(201);
				numList.add(301);
				numList.add(301);
				numList.add(501);
				
				System.out.println(numList.get(0));
				System.out.println(numList.get(1));
				
				numList.remove(4);
				numList.remove(Integer.valueOf(1098));
				System.out.println(numList);
		}
		
		public static boolean isSubset(List<Integer> big,List<Integer> small) {
			return big.containsAll(small);
		}
}
